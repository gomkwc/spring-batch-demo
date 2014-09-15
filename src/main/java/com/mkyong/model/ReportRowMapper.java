package com.mkyong.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * User: David KIM
 * Date: 14. 9. 15.
 * Time: 오후 1:02
 * To change this template use File | Settings | File Templates.
 */
public class ReportRowMapper  implements RowMapper<Report> {

    @Override
    public Report mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Report report = new Report();
        report.setDate(resultSet.getString("date"));
        report.setImpressions(resultSet.getString("impressions"));
        report.setClicks(resultSet.getString("clicks"));
        report.setEarning(resultSet.getString("earning"));
        return report;
    }

}