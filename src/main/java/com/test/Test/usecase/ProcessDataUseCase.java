package com.test.Test.usecase;

import com.test.Test.model.TeamDTO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ProcessDataUseCase {

    private DataUseCase dataUseCase;

    public List<TeamDTO> getAll(){
        return dataUseCase.createTeams();
    }

    public List<TeamDTO> getByOrigin(String origin) {
        return dataUseCase.createTeams()
                .stream().filter(t -> t.getOrigin().equalsIgnoreCase(origin)).collect(Collectors.toList());
    }

    public List<TeamDTO> getByScore(String score) {
        return dataUseCase.createTeams()
                .stream().filter(t -> t.getScore() >= Integer.parseInt(score)).collect(Collectors.toList());
    }

    public TeamDTO getByBestScore() {
        List<TeamDTO> teamDTOS = dataUseCase.createTeams();
        teamDTOS.sort((x, y) -> Integer.compare(y.getScore(), x.getScore()));
        return teamDTOS.get(0);
    }

    public Optional<TeamDTO> getByName(String name) {
        return dataUseCase.createTeams()
                .stream().filter(t -> t.getName().equalsIgnoreCase(name)).findFirst();
    }
}
