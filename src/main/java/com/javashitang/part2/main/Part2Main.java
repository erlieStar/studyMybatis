package com.javashitang.part2.main;

import com.javashitang.part2.mapper.StudentMapper;
import com.javashitang.part2.pojo.StudentBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Part2Main {

    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config2.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = null;
        SqlSession sqlSession2 = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            StudentBean studentBean = studentMapper.getStudent(2016);//发出SQL
            System.out.println("使用同一个sqlSession再执行一次");
            StudentBean studentBean2 = studentMapper.getStudent(2016);//没有发出SQL
            //使用二级缓存commit后才能使用
            sqlSession.commit();
            System.out.println("创建一个新的sqlSession再执行一次");
            sqlSession2 = sqlSessionFactory.openSession();
            StudentMapper studentMapper2 = sqlSession2.getMapper(StudentMapper.class);
            StudentBean studentBean3 = studentMapper2.getStudent(2016);//没有发出SQL
            System.out.println("woca");
            sqlSession.commit();
            System.out.println("hhee");
        } catch(Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
