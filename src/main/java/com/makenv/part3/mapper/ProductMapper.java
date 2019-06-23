package com.makenv.part3.mapper;

import com.makenv.part3.po.Product;

import java.util.List;

public interface ProductMapper {

    List<Product> selectProductList();
}
