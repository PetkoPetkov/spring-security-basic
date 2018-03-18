package com.maistorat.repo.impl;

import com.maistorat.model.User;
import com.maistorat.repo.UserRepo;
import com.maistorat.repo.query.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Petio on 28.2.2018 г..
 */
@Repository
@Transactional
public class UserRepoImpl implements UserRepo {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
//    do not @Autowired, just declare
    private UserCreateQuery userCreateQuery;
    private UserReadQuery userReadQuery;
    private UserUpdateQuery userUpdateQuery;
    private UserDeleteQuery userDeleteQuery;
    private UserSearchQuery userSearchQuery;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.userCreateQuery = new UserCreateQuery(dataSource);
        this.userReadQuery = new UserReadQuery(dataSource);
        this.userUpdateQuery = new UserUpdateQuery(dataSource);
        this.userDeleteQuery = new UserDeleteQuery(dataSource);
        this.userSearchQuery = new UserSearchQuery(dataSource);
    }

    @Override
    public Long createUser(User user) {
        Long userId = this.userCreateQuery.execute(user);
        return userId;
    }

    public User readUser(Long id) {
        User user = this.userReadQuery.execute(id);
        return user;
    }

    @Override
    public void updateUser(User user) {
        this.userUpdateQuery.execute(user);
    }

    @Override
    public void deleteUser(Long userId) {
        this.userDeleteQuery.execute(userId);
    }

    public List<User> findAllUsers() {
//        List<User> users = this.userSearchQuery.execute();
        return null;
    }

}
