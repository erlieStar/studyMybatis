package com.javashitang.part2.mapper;

import com.javashitang.part2.po.LectureBean;
import org.apache.ibatis.annotations.Param;

public interface LectureMapper {

    public LectureBean getLecture(@Param("lectureId")int lectureId);
    public int insertLecture(LectureBean lectureBean);
}
