package com.crio.qcontest.repositories;

import com.crio.qcontest.entities.User;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class UserRepository  implements IUserRepository {
    private final Map<Long, User> storage = new HashMap<>();
    private AtomicLong idCounter = new AtomicLong(0);

    public User save(User entity) {
        User user = new User(idCounter.incrementAndGet(), entity);
        storage.putIfAbsent(user.getId(), user);
        return user;
    }

    public List<User> findAll() {
        return new ArrayList<>(storage.values());

    }

    @Override
    public Optional<User> findById(Long id) {
        User user = storage.get(id);
        return Optional.ofNullable(user);  // Wrap user in Optional
    }

}
