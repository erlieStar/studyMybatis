package com.javashitang.part1.main;

import com.javashitang.part1.mapper.RoleMapper;
import com.javashitang.part1.plugins.PageHelper;
import com.javashitang.part1.plugins.PageInfo;
import com.javashitang.part1.pojo.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Part1Main7 {

    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            PageHelper.preparePageRequest(3, 5);
            List<Role> roles = roleMapper.findAllRoles();
            PageInfo pageInfo = PageHelper.popAfterAll();
            System.out.println("pageInfo " + pageInfo);
            System.out.println("roles size " + roles.size());
            sqlSession.commit();
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
