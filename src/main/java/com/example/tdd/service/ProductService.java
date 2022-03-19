package com.example.tdd.service;

import com.example.tdd.data.dto.ProductDto;

public interface ProductService {
    ProductDto getProduct(String productId);

    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);
}
