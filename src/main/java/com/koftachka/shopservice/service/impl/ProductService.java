package com.koftachka.shopservice.service.impl;

import com.koftachka.shopservice.model.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAll();

    Object listProducts();

    Object getProductById(Long id);

    void saveProduct(ProductDto product);

    void deleteProduct(Long id);
}
