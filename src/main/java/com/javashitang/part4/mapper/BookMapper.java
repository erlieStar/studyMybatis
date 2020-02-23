package com.javashitang.part4.mapper;

import com.javashitang.part4.pojo.Book;

import java.util.List;

public interface BookMapper {

    List<Book> selectBookById(Integer id);
}
