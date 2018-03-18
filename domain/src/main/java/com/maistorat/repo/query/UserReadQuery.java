package com.maistorat.repo.query;

import com.maistorat.model.User;
import com.maistorat.repo.mapper.UserMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Petio on 12.3.2018 г..
 */

public class UserReadQuery extends UserMapper {
    private static final String SQL_QUERY =
            "SELECT * FROM User WHERE idUser=:id";

    public UserReadQuery(DataSource dataSource) {
        super(dataSource, SQL_QUERY);
        declareParameter(new SqlParameter("id", Types.INTEGER));
        compile();
    }

    public User execute(Long userId) {
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("id", userId);

        List<User> result = super.executeByNamedParam(inParams);
        if (result != null && !result.isEmpty()) {
            return result.get(0);
        }
        return null;
    }
}
