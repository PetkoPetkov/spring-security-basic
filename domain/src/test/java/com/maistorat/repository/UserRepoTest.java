package com.maistorat.repository;

import com.maistorat.ConfigBean;
import com.maistorat.DataBasesConfig;
import com.maistorat.config.ConfigDomain;
import com.maistorat.model.User;
import com.maistorat.repo.UserRepo;
import com.maistorat.repo.impl.UserRepoImpl;
import com.maistorat.util.BootstrapUtil;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.support.AbstractTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Petio on 26.2.2018 г..
 */
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

//@WebAppConfiguration
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConfigBean.class, ConfigDomain.class})
//@TestExecutionListeners
//        ({DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class
////        ,TransactionalTestExecutionListener.class OR (extends AbstractTransactionalJUnit4SpringContextTests)
//    })
@Rollback
//@Transactional
public class UserRepoTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    private UserRepo userRepo;

    @Test
    public void createUser() {
        User user = BootstrapUtil.createUserObject();
        Long id = this.userRepo.createUser(user);
        Assert.assertNotNull(id);
        User readUser = this.userRepo.readUser(id);
        Assert.assertNotNull(readUser);
        Assert.assertEquals(id, readUser.getId());
    }

    @Test
    public void readUser() {
        Long userId = 1L;
        User user = this.userRepo.readUser(userId);
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getId(), userId);
    }

    @Test
    public void updateUser() {
//        User user = createUserObject();
//        Long id = this.userRepo.createUser(user);
//        Assert.assertNotNull(id);
//        user.setFirstName(user.getFirstName() + "_updated");
//        this.userRepo.updateUser(user);
//        User findUser = this.userRepo.readUser(id);
//        Assert.assertNotNull(findUser);
//        Assert.assertEquals(findUser.getId(), id);
//        Assert.assertEquals(findUser.getFirstName(), user.getFirstName() + "_updated");
    }

    @Test
    public void deactivateUser() {

    }

    @Test
    public void findAllUsers() {
//        List<User> users = this.userRepo.findAllUsers();
//        Assert.assertNotNull(users);
    }




//    @Autowired
//    public void setUserRepo(UserRepo userRepo) {
//        this.userRepo = userRepo;
//    }
}
