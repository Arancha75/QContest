package com.crio.qcontest.entities;

import java.util.List;

public class Contest {
    private final Long id;
    private final String name;
    private final User creator;
    private final DifficultyLevel level;
    private final List<Question> questions;

    public Contest(String name, User user, DifficultyLevel level, List<Question> contestQuestion) {
        this.name = name;
        this.creator = user;
        this.level = level;
        this.questions = contestQuestion;
        this.id = null;
    }

    public Contest(Long id, Contest other) {
        this.id = id;
        this.name = other.name;
        this.level = other.level;
        this.creator=other.creator;
        this.questions=other.questions;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User getCreator() {
        return creator;
    }

    public DifficultyLevel getLevel() {
        return level;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public String toString() {
       return "Contest [id=" + id + "]";
    }
}
