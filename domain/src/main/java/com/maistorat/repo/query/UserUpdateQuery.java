package com.maistorat.repo.query;

import com.maistorat.model.User;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Petio on 14.3.2018 г..
 */
public class UserUpdateQuery extends SqlUpdate {
    private static final String SQL_QUERY =
            "UPDATE User SET firstName=:firstName, surname=:surname, lastName=:lastName WHERE idUser=:id";

    public UserUpdateQuery(DataSource ds) {
        super(ds, SQL_QUERY);

        declareParameter(new SqlParameter("id", Types.NUMERIC));
        declareParameter(new SqlParameter("firstName", Types.VARCHAR));
        declareParameter(new SqlParameter("surname", Types.VARCHAR));
        declareParameter(new SqlParameter("lastName", Types.VARCHAR));

        compile();
    }

    public void execute(User user) {
        Map<String, Object> inParams = new HashMap<String, Object>();

        inParams.put("id", user.getId());
        inParams.put("firstName", user.getFirstName());
        inParams.put("surname", user.getSurname());
        inParams.put("lastName", user.getLastName());

        super.updateByNamedParam(inParams);

    }
}
