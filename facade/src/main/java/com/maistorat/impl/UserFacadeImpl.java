package com.maistorat.impl;

import com.maistorat.UserFacade;
import com.maistorat.model.User;
import com.maistorat.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Petio on 28.2.2018 г..
 */
@Controller
@EnableWebMvc
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserFacadeImpl implements UserFacade {
    private UserRepo userRepo;

    public UserFacadeImpl() {

    }
    @Autowired
    private UserFacadeImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    @PostMapping
    @ResponseBody
    public Long createUser(@RequestBody User user) {
        return this.userRepo.createUser(user);
    }

    @Override
    @GetMapping(value = "/read/{id}")
    @ResponseBody
//    @PreAuthorize("hasPermission()")
    public User readUser(@PathVariable Long id) {
        return this.userRepo.readUser(id);
    }

    @Override
    @PutMapping(value = "/update")
    @ResponseBody
//    @PreAuthorize("hasPermission()")
    public void updateUser(@RequestBody User user) {
        this.userRepo.updateUser(user);
    }

    @Override
    @PutMapping(value = "/delete/{id}")
    @ResponseBody
//    @PreAuthorize("hasPermission()")
    public void deleteUser(@PathVariable Long id) {
        this.userRepo.deleteUser(id);
    }

    @Override
    @GetMapping(value = "/users")
    @ResponseBody
//    @PreAuthorize("hasPermission('USER')")
    public String findAllUsers() {
        this.userRepo.findAllUsers();
        return "helloWorldPage";
    }

}
