package com.example.tdd.data.entity;

import com.example.tdd.data.dto.ProductDto;
import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    String id;

    String name;

    Integer price;

    Integer stock;

    public ProductDto toDto() {
        return ProductDto.builder()
                .productId(id)
                .productName(name)
                .productPrice(price)
                .productStock(stock)
                .build();
    }
}
