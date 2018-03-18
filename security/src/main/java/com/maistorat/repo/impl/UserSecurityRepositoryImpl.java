package com.maistorat.repo.impl;

import com.maistorat.model.UserSecurity;
import com.maistorat.repo.UserSecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Petio on 3.3.2018 г..
 */
@Repository
public class UserSecurityRepositoryImpl implements UserSecurityRepository {
    NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }


    @Override
    public UserSecurity findUserByUsername(String username) {
        final String SQL_QUERY = "select * from UserLogin where username = :username";
        SqlParameterSource namedParameters = new MapSqlParameterSource("username", username);
        UserSecurity userSecurity = this.jdbcTemplate.queryForObject(SQL_QUERY, namedParameters, new UserSecurityMapper());

        return userSecurity;
    }

    private static final class UserSecurityMapper implements RowMapper<UserSecurity> {

        public UserSecurity mapRow(ResultSet rs, int rowNum) throws SQLException {
            UserSecurity user = new UserSecurity(
                    rs.getLong("idUserLogin"),
                    rs.getString("username"),
                    rs.getString("passwordHash"),
                    rs.getString("email"),
                    true,true,true,true,
                    null
            );
            return user;
        }
    }
}
