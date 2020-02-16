package com.javashitang.part2.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.javashitang.part2.po.SexEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;


public class SexEnumHandler implements TypeHandler<SexEnum> {

	public void setParameter(PreparedStatement ps, int i, SexEnum parameter, JdbcType jdbcType) throws SQLException {
		System.out.println("使用自定义handler");
		ps.setInt(i, parameter.getSexId());
	}

	public SexEnum getResult(ResultSet rs, String columnName) throws SQLException {
		System.out.println("使用自定义handler");
		return SexEnum.getSex(rs.getInt(columnName));
	}

	public SexEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
		System.out.println("使用自定义handler");
		return SexEnum.getSex(rs.getInt(columnIndex));
	}

	public SexEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
		System.out.println("使用自定义handler");
		return SexEnum.getSex(cs.getInt(columnIndex));
	}

}
