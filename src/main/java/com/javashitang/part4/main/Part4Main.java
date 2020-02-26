package com.javashitang.part4.main;

import com.javashitang.part4.mapper.AuthorMapper;
import com.javashitang.part4.mapper.BookMapper;
import com.javashitang.part4.pojo.Author;
import com.javashitang.part4.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Part4Main {

    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config4.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession(true);
//            AuthorMapper authorMapper = sqlSession.getMapper(AuthorMapper.class);
//            List<Author> authorList = authorMapper.selectAuthortList();
//            authorList.forEach(item -> {
//                System.out.println(item);
//            });
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
//            Book book = bookMapper.selectBookByIdAndName(1, "Java面试通关");
//            System.out.println(book);
//            int count = bookMapper.updateById(1, "修改后Java面试通关");
//            System.out.println(count);
//            List<Book> bookList = bookMapper.selectBookById(Arrays.asList(1));
//            bookList.forEach(item -> {
//                System.out.println(item);
//            });
            int num = bookMapper.deleteById(1);
            System.out.println(num);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
