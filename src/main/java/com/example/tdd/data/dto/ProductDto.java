package com.example.tdd.data.dto;

import com.example.tdd.data.entity.Product;
import com.sun.istack.internal.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

    @NotNull
    private String productId;

    @NotNull
    private String productName;

    @NotNull
    private int productPrice;

    @NotNull
    private int productStock;

    public Product toEntity() {
        return Product.builder()
                .id(productId)
                .name(productName)
                .price(productPrice)
                .stock(productStock)
                .build();
    }
}
