package com.maistorat.repo.query;

import com.maistorat.model.User;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Petio on 14.3.2018 г..
 */
public class UserDeleteQuery extends SqlUpdate {
    private static final String SQL_QUERY =
            "select * from User where idUser=:id";

    public UserDeleteQuery(DataSource dataSource) {
        super(dataSource, SQL_QUERY);
        declareParameter(new SqlParameter("id", Types.INTEGER));
        compile();
    }

    public void execute(Long sandwichId) {
        Map<String, Object> inParams = new HashMap<String, Object>();

        inParams.put("id", sandwichId);

        super.updateByNamedParam(inParams);
    }
}
