package com.crio.qcontest.repositories;

import com.crio.qcontest.entities.Contest;
import com.crio.qcontest.entities.Contestant;
import com.crio.qcontest.entities.DifficultyLevel;

import java.util.List;
import java.util.Optional;

public interface IContestRepository {
    Contest save(Contest question);
    List<Contest> findAll();
    Optional<Contest> findById(Long id);
    List<Contest> findByDifficultyLevel(DifficultyLevel level);

    Contestant save(Contestant contestant);
}
