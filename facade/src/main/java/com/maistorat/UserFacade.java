package com.maistorat;

import com.maistorat.model.User;

import java.util.List;

/**
 * Created by Petio on 28.2.2018 г..
 */
public interface UserFacade {
    User readUser(Long id);
    List<User> findAllUsers();
    String readUsername(String username);
}
