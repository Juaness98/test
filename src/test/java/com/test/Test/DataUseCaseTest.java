package com.test.Test;

import com.test.Test.model.TeamDTO;
import com.test.Test.usecase.DataUseCase;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class DataUseCaseTest {

	@InjectMocks
	DataUseCase dataUseCase;

	@Test
	void getAll() {
		List<TeamDTO> list = dataUseCase.createTeams();
		Assert.notEmpty(list);
	}

}
