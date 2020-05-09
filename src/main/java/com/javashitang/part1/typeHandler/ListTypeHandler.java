package com.javashitang.part1.typeHandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author lilimin
 * @since 2020-05-08
 */
public class ListTypeHandler implements TypeHandler<List<Map<String, String>>> {


    @Override
    public void setParameter(PreparedStatement ps, int i, List<Map<String, String>> parameter, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public List<Map<String, String>> getResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    @Override
    public List<Map<String, String>> getResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public List<Map<String, String>> getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
