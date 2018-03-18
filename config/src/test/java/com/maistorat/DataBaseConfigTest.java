package com.maistorat;

/**
 * Created by Petio on 26.2.2018 г..
 */
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = ConfigBean.class)
//@TestExecutionListeners({DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class})
//@Rollback
//@Transactional
//public class DataBaseConfigTest {
////    private static final String SQL_QUERY = "select * from User u";
////    @Autowired
////    NamedParameterJdbcTemplate jdbcTemplate;
////    private static DataBaseConfigTest ourInstance = new DataBaseConfigTest();
//
////    public static DataBaseConfigTest getInstance() {
////        return ourInstance;
////    }
//
//    public DataBaseConfigTest() {
//    }
//
//    @Test
//    public void databaseConnectionTest() {
////        SqlParameterSource namedParameters = new MapSqlParameterSource();
//////                .addValue("id", 1);
////        Object object = jdbcTemplate.queryForList(SQL_QUERY, namedParameters);
////        Assert.assertNotNull(object);
//    }
//
//
//
//}
