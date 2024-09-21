package com.crio.qcontest.repositories;

import com.crio.qcontest.entities.Question;
import com.crio.qcontest.entities.DifficultyLevel;

import java.util.List;
import java.util.Optional;

public interface IQuestionRepository {
    Question save(Question question);
    List<Question> findAll();
    Optional<Question> findById(Long id);
    List<Question> findByDifficultyLevel(DifficultyLevel level);
    Integer count();
}
