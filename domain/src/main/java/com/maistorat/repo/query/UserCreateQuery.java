package com.maistorat.repo.query;

import com.maistorat.model.User;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import javax.sql.DataSource;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Petio on 14.3.2018 г..
 */
public class UserCreateQuery extends SqlUpdate {
    private static final String SQL_QUERY =
            "INSERT INTO User (firstName, surname, lastName) VALUES (:firstName, :surname, :lastName)";

    public UserCreateQuery(DataSource ds) {
        super(ds, SQL_QUERY);

        declareParameter(new SqlParameter("firstName", Types.VARCHAR));
        declareParameter(new SqlParameter("surname", Types.VARCHAR));
        declareParameter(new SqlParameter("lastName", Types.VARCHAR));

        setReturnGeneratedKeys(true);
        compile();
    }

    public Long execute(User user) {
        Map<String, Object> inParams = new HashMap<String, Object>();

        inParams.put("firstName", user.getFirstName());
        inParams.put("surname", user.getSurname());
        inParams.put("lastName", user.getLastName());

        KeyHolder keyHolder = new GeneratedKeyHolder();

        super.updateByNamedParam(inParams, keyHolder);

        return keyHolder.getKey().longValue();
    }
}
