package com.javashitang.part2.mapper;

import com.javashitang.part2.po.StudentBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    public StudentBean getStudent(@Param("studentId") int studentId);
    public List<StudentBean> findAllStudent();
}
