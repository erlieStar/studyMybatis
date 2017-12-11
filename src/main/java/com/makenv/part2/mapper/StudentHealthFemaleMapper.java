package com.makenv.part2.mapper;

import java.util.List;

import com.makenv.part2.po.sub.StudentHealthFemaleBean;
import org.apache.ibatis.annotations.Param;


public interface StudentHealthFemaleMapper {
	List<StudentHealthFemaleBean> findStudentHealthFemaleByStudentId(@Param("studentId") int id);
	void insertFemale(StudentHealthFemaleBean female);
}
