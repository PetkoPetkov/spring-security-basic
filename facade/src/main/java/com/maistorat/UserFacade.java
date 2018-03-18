package com.maistorat;

import com.maistorat.model.User;

import java.util.List;

/**
 * Created by Petio on 28.2.2018 г..
 */
public interface UserFacade {
    Long createUser(User user);

    User readUser(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    String findAllUsers();
}
