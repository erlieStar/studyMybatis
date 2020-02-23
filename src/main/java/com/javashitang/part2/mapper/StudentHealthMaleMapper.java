package com.javashitang.part2.mapper;

import java.util.List;

import com.javashitang.part2.pojo.sub.StudentHealthMaleBean;
import org.apache.ibatis.annotations.Param;


public interface StudentHealthMaleMapper {
	List<StudentHealthMaleBean> findStudentHealthMaleByStudentId(@Param("studentId") int id);
	void insertMale(StudentHealthMaleBean male);
}
