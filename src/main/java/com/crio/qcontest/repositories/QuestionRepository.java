package com.crio.qcontest.repositories;

import com.crio.qcontest.entities.DifficultyLevel;
import com.crio.qcontest.entities.Question;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class QuestionRepository  implements  IQuestionRepository{
    Map<Long, Question> storage = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong(0);

    public Question save(Question entity){
        Question question = new Question(idCounter.incrementAndGet(),entity);
        storage.putIfAbsent(question.getId(),question);
        return question;
    }

    public List<Question> findAll(){
        return new ArrayList<>(storage.values());
    }

    public List<Question> findByDifficultyLevel(DifficultyLevel level){
        return storage.values().stream().filter(q -> q.getLevel() == level).collect(Collectors.toList());
    }

    public Optional<Question> findById(Long id){
        return Optional.ofNullable(storage.get(id));
    }

    public Integer count(){
        return storage.size();
    }


}
