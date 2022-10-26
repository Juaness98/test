package com.test.Test;

import com.test.Test.model.TeamDTO;
import com.test.Test.usecase.DataUseCase;
import com.test.Test.usecase.ProcessDataUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProcessDataUseCaseTest {

	@InjectMocks
	@Spy
	ProcessDataUseCase processDataUseCase;

	@Mock
	DataUseCase dataUseCase;

	List<TeamDTO> teamDTOS = new ArrayList<>();
	TeamDTO a = new TeamDTO("a", "a", 1);
	TeamDTO b = new TeamDTO("b", "b", 2);
	TeamDTO c = new TeamDTO("c", "c", 3);

	@BeforeEach
	public void init(){
		this.teamDTOS.add(a);
		this.teamDTOS.add(b);
		this.teamDTOS.add(c);
	}
	@Test
	void getAll() {
		doReturn(teamDTOS).when(dataUseCase).createTeams();
		List<TeamDTO> rest = processDataUseCase.getAll();
		Assert.notEmpty(rest, "ok");
	}

	@Test
	void getByOrigin() {
		doReturn(teamDTOS).when(dataUseCase).createTeams();
		List<TeamDTO> rest = processDataUseCase.getByOrigin("b");
		assertEquals(Collections.singletonList(b), rest);
	}

	@Test
	void getByScore() {
		List<TeamDTO> expect = new ArrayList<>();
		Collections.addAll(expect, b, c);

		doReturn(teamDTOS).when(dataUseCase).createTeams();
		List<TeamDTO> rest = processDataUseCase.getByScore("2");
		assertEquals(expect, rest);
	}

	@Test
	void getByBestScore() {
		doReturn(teamDTOS).when(dataUseCase).createTeams();
		TeamDTO rest = processDataUseCase.getByBestScore();
		assertEquals(c, rest);
	}

	@Test
	void getByName() {
		doReturn(teamDTOS).when(dataUseCase).createTeams();
		Optional<TeamDTO> rest = processDataUseCase.getByName("a");
		assertEquals(Optional.of(a), rest);
	}

}
