package com.maistorat.repo.query;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Petio on 15.3.2018 г..
 */
public class UserSearchQuery {
    private static final String SQL_QUERY =
            "";

    public UserSearchQuery(DataSource dataSource) {
//        super(dataSource, SQL_QUERY);
    }


    public Object execute(
//            ResultMode resultsMode, Integer startIndex, Integer pageSize, Long parentDepartmentId,
//                          Long departmentId, Long loadHierarchy,
//                          String uic, String areaCode, Integer loadCache
    ) {
//        Map<String, Object> inParams = new HashMap<>();
//
//        inParams.put("p_ResultsMode", resultsMode.getDbValue());
//        inParams.put("p_ParentDepartmentID", parentDepartmentId);
//        inParams.put("p_DepartmentID", departmentId);
//        inParams.put("p_LoadHierarchy", loadHierarchy);
//        inParams.put("p_UIC", uic);
//        inParams.put("p_AreaCode", areaCode);
//        inParams.put("p_StartIndex", startIndex);
//        inParams.put("p_PageSize", pageSize);
//        inParams.put("p_LoadCache", loadCache);
//
//        Map<String, Object> results = super.execute(inParams);
//        List<Department> departments = (List<Department>) results.get(OUTPUT_CURSOR);
//        Object p_resultsCount_out = results.get("p_ResultsCount_out");
//        Long count = null;
//        if (p_resultsCount_out != null) {
//            count = ((BigDecimal) p_resultsCount_out).longValue();
//        }
//        return new Page<Department>(count, departments);
        return null;
    }
}
