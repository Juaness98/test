package com.test.Test.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class TeamDTO {
    private String name;
    private String origin;
    private int score;

    public TeamDTO(String name, String origin, int score) {
        this.name = name;
        this.origin = origin;
        this.score = score;
    }
}
