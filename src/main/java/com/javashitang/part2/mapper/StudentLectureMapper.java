package com.javashitang.part2.mapper;

import com.javashitang.part2.pojo.StudentLectureBean;
import org.apache.ibatis.annotations.Param;

public interface StudentLectureMapper {

    public StudentLectureBean findStudentLectureByStudentId(@Param("studentId")int studentId);
}
