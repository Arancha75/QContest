package com.crio.qcontest.repositories;

import com.crio.qcontest.entities.User;
import java.util.*;
public interface IUserRepository {
    public User save(User user);
    List<User> findAll();
    Optional<User> findById(Long id);

}
