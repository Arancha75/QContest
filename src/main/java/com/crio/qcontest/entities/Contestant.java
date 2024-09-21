package com.crio.qcontest.entities;

import java.util.Set;
import java.util.*;

public class Contestant {
    private final User user;
    private final Contest contest;
    private Integer totalScore;
    private final Set<Question> solvedQuestions;

    public Contestant(User user, Contest contest) {
        this.user = user;
        this.contest = contest;
        this.totalScore=0;
        this.solvedQuestions= new HashSet<Question>();
    }

    public User getUser() {
        return user;
    }

    public Contest getContest() {
        return contest;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Long getUserId(){
        return user.getId();
    }

    public Long getContestId(){
        return contest.getId();
    }

    public List<Question> getSolvedQuestions() {
        return new ArrayList<>(solvedQuestions);
    }

    public void addQuestion(Question question){
        solvedQuestions.add(question);
        totalScore += question.getScore();
    }

    @Override
    public String toString() {
        return "Contestant [user=" + user.getId() + ", contest=" + contest.getId() +
                ", totalScore=" + totalScore + ", solvedQuestions=" + solvedQuestions + "]";
    }
}
