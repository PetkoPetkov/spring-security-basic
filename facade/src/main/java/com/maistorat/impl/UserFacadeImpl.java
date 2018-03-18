package com.maistorat.impl;

import com.maistorat.UserFacade;
import com.maistorat.model.User;
import com.maistorat.repo.UserRepo;
import com.maistorat.repo.impl.UserRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

/**
 * Created by Petio on 28.2.2018 г..
 */
@Controller
@EnableWebMvc
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class UserFacadeImpl implements UserFacade {
    private UserRepo userRepo;
//    private UserFacade userFacade = new UserFacadeImpl(new UserRepoImpl());

    public UserFacadeImpl() {

    }
    @Autowired
    private UserFacadeImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    @GetMapping(value = "/")
    @ResponseBody
//    @PreAuthorize("hasPermission()")
    public User readUser(Long id) {
        User user = this.userRepo.findAllUsers().get(0);
        return user;
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
//    @PreAuthorize("hasPermission('USER')")
    public List<User> findAllUsers() {
        List<User> users = this.userRepo.findAllUsers();
        return users;
    }

    @Override
    @RequestMapping(value = "/role", method = RequestMethod.POST)
//    @PreAuthorize("hasPermission('USER')")
    public @ResponseBody String readUsername(@RequestBody String username) {
      System.out.println(username);

        return username;
    }


}
