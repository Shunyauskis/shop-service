package com.koftachka.shopservice.repositories;

import com.koftachka.shopservice.model.ProductDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDto, Integer> {
}
