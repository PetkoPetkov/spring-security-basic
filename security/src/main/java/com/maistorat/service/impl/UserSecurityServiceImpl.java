package com.maistorat.service.impl;

import com.maistorat.model.UserSecurity;
import com.maistorat.repo.UserSecurityRepository;
import com.maistorat.service.UserSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;

/**
 * Created by Petio on 3.3.2018 г..
 */
@Controller
public class UserSecurityServiceImpl implements UserSecurityService {
    private UserSecurityRepository userSecurityRepository;

    @Autowired
    public UserSecurityServiceImpl(UserSecurityRepository userSecurityRepository) {
        this.userSecurityRepository = userSecurityRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Assert.hasText(username);
        UserSecurity userSecurity = userSecurityRepository.findUserByUsername(username);

        if(userSecurity == null) {
            throw new UsernameNotFoundException("Username not found");
        }

        return userSecurity;
    }
}
