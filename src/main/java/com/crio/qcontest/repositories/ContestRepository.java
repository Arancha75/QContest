package com.crio.qcontest.repositories;

import com.crio.qcontest.entities.Contest;
import com.crio.qcontest.entities.DifficultyLevel;
import com.crio.qcontest.entities.Question;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class ContestRepository implements IContestRepository {
    private final Map<Long, Contest> storage = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong(0);

    public Contest save(Contest entity) {
        Contest contest = new Contest(idCounter.incrementAndGet(),entity);
        storage.putIfAbsent(contest.getId(),contest);
        return contest;
    }

    @Override
    public List<Contest> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<Contest> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }
    @Override
    public List<Contest> findByDifficultyLevel(DifficultyLevel level) {
        return storage.values().stream().filter(q -> q.getLevel() == level).collect(Collectors.toList());
    }

}
