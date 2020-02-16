package com.javashitang.part3.main;

import com.javashitang.part3.mapper.ProductMapper;
import com.javashitang.part3.po.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Part3Main {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config3.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            List<Product> productList = productMapper.selectProductList();
            for (Product product : productList) {
                System.out.println(product);
            }
        } finally {
            sqlSession.close();
        }
    }
}
