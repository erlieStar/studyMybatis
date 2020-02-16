package com.javashitang.part2.mapper;

import com.javashitang.part2.po.StudentSelfcardBean;
import org.apache.ibatis.annotations.Param;

public interface StudentSelfcardMapper {
    public StudentSelfcardBean findStudentSelfcardByStudentId(@Param("studentId") int studentId);
}
