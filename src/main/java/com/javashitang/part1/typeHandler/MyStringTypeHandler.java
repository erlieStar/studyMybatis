package com.javashitang.part1.typeHandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.apache.log4j.Logger;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//定义javaType类型，指定哪些Java类型被拦截
@MappedTypes({String.class})
//定义jdbcType类型，需要满足枚举类org.apache.ibatis.type.JdbcType所列的枚举类型
@MappedJdbcTypes({JdbcType.VARCHAR})
public class MyStringTypeHandler implements TypeHandler<String>{

    private Logger log = Logger.getLogger(MyStringTypeHandler.class);

    public void setParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        log.info("使用我TypeHandler");
        preparedStatement.setString(i,s);
    }

    public String getResult(ResultSet resultSet, String s) throws SQLException {
        log.info("ResultSet列名获取字符串");
        return resultSet.getString(s);
    }

    public String getResult(ResultSet resultSet, int i) throws SQLException {
        log.info("ResultSet下标获取字符串");
        return resultSet.getString(i);
    }

    public String getResult(CallableStatement callableStatement, int i) throws SQLException {
        log.info("CallableStatement下标获取字符串");
        return callableStatement.getString(i);
    }
}
