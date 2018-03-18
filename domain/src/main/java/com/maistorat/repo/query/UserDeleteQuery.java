package com.maistorat.repo.query;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;
import javax.sql.DataSource;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Petio on 14.3.2018 г..
 */
public class UserDeleteQuery extends SqlUpdate {
    private static final String SQL_QUERY =
            "DELETE FROM User WREHE idUser=:id";

    public UserDeleteQuery(DataSource dataSource) {
        super(dataSource, SQL_QUERY);
        declareParameter(new SqlParameter("id", Types.INTEGER));
        compile();
    }

    public void execute(Long userId) {
        Map<String, Object> inParams = new HashMap<String, Object>();

        inParams.put("id", userId);

        super.updateByNamedParam(inParams);
    }
}
