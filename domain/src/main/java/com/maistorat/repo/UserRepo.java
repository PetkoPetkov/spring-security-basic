package com.maistorat.repo;

import com.maistorat.model.User;

import java.util.List;

/**
 * Created by Petio on 28.2.2018 г..
 */
public interface UserRepo {
    Long createUser(User user);

    User readUser(Long id);

    void updateUser(User user);

    void deleteUser(Long userId);

    List<User> findAllUsers();
}
