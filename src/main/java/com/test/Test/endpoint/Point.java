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

@RestController
@RequestMapping("/test")
public class Point {

    @Autowired
    public ProcessDataUseCase processDataUseCase;

    @GetMapping("/get-all")
    public ResponseEntity<List<TeamDTO>> getAll(){
        return new ResponseEntity<>(processDataUseCase.getAll(), HttpStatus.OK);
    }

    @GetMapping("/get-by-origin")
    public ResponseEntity<List<TeamDTO>> getByOrigin(@RequestParam("origin") String origin){
        return new ResponseEntity<>(processDataUseCase.getByOrigin(origin), HttpStatus.OK);
    }

    @GetMapping("/get-by-score")
    public ResponseEntity<List<TeamDTO>> getByScore(@RequestParam("score") String score){
        return new ResponseEntity<>(processDataUseCase.getByScore(score), HttpStatus.OK);
    }

    @GetMapping("/get-by-best-score")
    public ResponseEntity<TeamDTO> getByBestScore(){
        return new ResponseEntity<>(processDataUseCase.getByBestScore(), HttpStatus.OK);
    }

    @GetMapping("/get-by-name")
    public ResponseEntity<Optional<TeamDTO>> getByName(@RequestParam("name") String name){
        return new ResponseEntity<>(processDataUseCase.getByName(name), HttpStatus.OK);
    }
}
