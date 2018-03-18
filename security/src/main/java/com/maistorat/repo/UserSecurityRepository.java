package com.maistorat.repo;

import com.maistorat.model.UserSecurity;

/**
 * Created by Petio on 3.3.2018 г..
 */
public interface UserSecurityRepository {
    UserSecurity findUserByUsername(String username);
}
