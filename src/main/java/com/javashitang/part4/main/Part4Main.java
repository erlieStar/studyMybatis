package com.javashitang.part4.main;

import com.javashitang.part4.mapper.AuthorMapper;
import com.javashitang.part4.pojo.Author;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Part4Main {

    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config4.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            AuthorMapper authorMapper = sqlSession.getMapper(AuthorMapper.class);
            List<Author> authorList = authorMapper.selectAuthortList();
            authorList.forEach(item -> {
                System.out.println(item);
            });
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
