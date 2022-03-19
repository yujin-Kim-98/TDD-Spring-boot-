package com.example.tdd.data.dao.impl;

import com.example.tdd.data.dao.ProductDAO;
import com.example.tdd.data.entity.Product;
import com.example.tdd.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDAOImpl implements ProductDAO {

    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        Product product1 = productRepository.save(product);
        return product1;
    }

    @Override
    public Product getProduct(String productId) {
        Product product = productRepository.getById(productId);
        return product;
    }
}
