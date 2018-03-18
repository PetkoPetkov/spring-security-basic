package com.maistorat.repo.mapper;

import com.maistorat.model.User;
import org.springframework.jdbc.object.MappingSqlQuery;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Petio on 8.3.2018 г..
 */
public class UserMapper extends MappingSqlQuery<User> {
    public UserMapper(DataSource dataSource, String sql) {
        super(dataSource, sql);
    }

    @Override
    protected User mapRow(ResultSet rs, int i) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("idUser"));
        user.setFirstName(rs.getString("firstName"));
        user.setSurname(rs.getString("surname"));
        user.setLastName(rs.getString("lastName"));
        return user;
    }
}
