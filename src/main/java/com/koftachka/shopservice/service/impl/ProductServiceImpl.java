package com.koftachka.shopservice.service.impl;

import com.koftachka.shopservice.model.ProductDto;
import com.koftachka.shopservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductService productService(ProductRepository productRepository){
        this.productRepository = productRepository;
        return null;
    }

    @Override
    public List<ProductDto> getAll() {
        return productRepository.findAll();
    }

    private List<ProductDto> products = new ArrayList<>();
    private long ID = 0;

    @Override
    public Object listProducts() {
        return new ArrayList<ProductDto>();
    }

    @Override
    public Object getProductById(Long id) {
        for(ProductDto product : products ){
            if (product.getId() == id) return product;
        }
        return null;
    }

    @Override
    @Transactional
    public void saveProduct(ProductDto product) {
        product.setId(++ID);
        products.add(product);
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId() ==id);
    }

    //// TODO: 06.09.2022 Repository
//    @Autowired
//    private ProductRepository productRepository;

//    @Override
//    public List<ProductDto> getAll() {
////        return List.of(new ProductDto("test", "Interesting Book", "Very interesting book", new Product, "01"));
//    }
}
