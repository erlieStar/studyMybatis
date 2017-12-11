package com.makenv.part2.mapper;

import com.makenv.part2.po.StudentSelfcardBean;
import org.apache.ibatis.annotations.Param;

public interface StudentSelfcardMapper {
    public StudentSelfcardBean findStudentSelfcardByStudentId(@Param("studentId") int studentId);
}
