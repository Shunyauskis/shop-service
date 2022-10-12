package com.koftachka.shopservice.configurators;

import com.koftachka.shopservice.model.ProductDto;
import com.koftachka.shopservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner (ProductRepository repository){
        return args -> {
            ProductDto productOne = new ProductDto(1,"Xiaomi", "XS", "1234");
            ProductDto productTwo = new ProductDto(2,"Xbox", "S10", "1235");

            repository.saveAll(List.of(productOne, productTwo));
        };
    }
}
