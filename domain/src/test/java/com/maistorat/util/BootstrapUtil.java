package com.maistorat.util;

import com.maistorat.model.User;

/**
 * Created by Petio on 15.3.2018 г...
 */
public class BootstrapUtil {
    public static User createUserObject() {
        User user = new User();
        user.setFirstName("Didi"); //use random generator
        user.setSurname("Dideva");
        user.setLastName("Petiova");
        return user;
    }
}
