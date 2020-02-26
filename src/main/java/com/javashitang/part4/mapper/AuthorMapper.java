package com.javashitang.part4.mapper;

import com.javashitang.part4.pojo.Author;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthorMapper {

    List<Author> selectAuthortList();

    int updateById(@Param("id") Integer id, @Param("name") String name);
}
