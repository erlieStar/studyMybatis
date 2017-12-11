package com.makenv.part2.mapper;

import com.makenv.part2.po.StudentLectureBean;
import org.apache.ibatis.annotations.Param;

public interface StudentLectureMapper {

    public StudentLectureBean findStudentLectureByStudentId(@Param("studentId")int studentId);
}
