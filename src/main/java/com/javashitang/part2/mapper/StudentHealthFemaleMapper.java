package com.javashitang.part2.mapper;

import java.util.List;

import com.javashitang.part2.po.sub.StudentHealthFemaleBean;
import org.apache.ibatis.annotations.Param;


public interface StudentHealthFemaleMapper {
	List<StudentHealthFemaleBean> findStudentHealthFemaleByStudentId(@Param("studentId") int id);
	void insertFemale(StudentHealthFemaleBean female);
}
