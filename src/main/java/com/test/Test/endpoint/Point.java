package com.test.Test.endpoint;

import com.test.Test.model.TeamDTO;
import com.test.Test.usecase.ProcessDataUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/test")
public class Point {

    @Autowired
    public ProcessDataUseCase processDataUseCase;

    @GetMapping("/get-all")
    public ResponseEntity<List<TeamDTO>> getAll(){
        List<TeamDTO> teamDTOS = processDataUseCase.createTeams();
        return new ResponseEntity<>(teamDTOS, HttpStatus.OK);
    }

    @GetMapping("/get-by-origin")
    public ResponseEntity<List<TeamDTO>> getByOrigin(@RequestParam("origin") String origin){
        List<TeamDTO> teamDTOS = processDataUseCase.createTeams()
                .stream().filter(t -> t.getOrigin().equalsIgnoreCase(origin)).collect(Collectors.toList());
        return new ResponseEntity<>(teamDTOS, HttpStatus.OK);
    }

    @GetMapping("/get-by-score")
    public ResponseEntity<List<TeamDTO>> getByScore(@RequestParam("score") String score){
        List<TeamDTO> teamDTOS = processDataUseCase.createTeams()
                .stream().filter(t -> t.getScore() >= Integer.parseInt(score)).collect(Collectors.toList());
        return new ResponseEntity<>(teamDTOS, HttpStatus.OK);
    }

    @GetMapping("/get-by-best-score")
    public ResponseEntity<TeamDTO> getByBestScore(){
        List<TeamDTO> teamDTOS = processDataUseCase.createTeams();
        teamDTOS.sort((x, y) -> Integer.compare(y.getScore(), x.getScore()));
        return new ResponseEntity<>(teamDTOS.get(0), HttpStatus.OK);
    }

    @GetMapping("/get-by-name")
    public ResponseEntity<Optional<TeamDTO>> getByName(@RequestParam("name") String name){
        Optional<TeamDTO> teamDTOS = processDataUseCase.createTeams()
                .stream().filter(t -> t.getName().equalsIgnoreCase(name)).findFirst();
        return new ResponseEntity<>(teamDTOS, HttpStatus.OK);
    }
}
