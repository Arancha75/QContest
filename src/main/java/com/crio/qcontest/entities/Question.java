package com.crio.qcontest.entities;

public class Question {
    private final Long id ;
    private final String text;
    private final DifficultyLevel level;
    private final Integer score;

    public Question(String text, DifficultyLevel level, Integer score) {
        this.text = text;
        this.level = level;
        this.score = score;
        this.id = null;
    }

    public Question(Long id , Question other) {
        this.id = id;
        this.text = other.text;
        this.level = other.level;
        this.score = other.score;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return text;
    }

    public DifficultyLevel getLevel() {
        return level;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + "]";
    }
}
