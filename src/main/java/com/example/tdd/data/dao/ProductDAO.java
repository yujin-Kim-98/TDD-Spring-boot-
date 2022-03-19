package com.example.tdd.data.dao;

import com.example.tdd.data.entity.Product;

public interface ProductDAO {

    Product saveProduct(Product product);

    Product getProduct(String productId);
}
