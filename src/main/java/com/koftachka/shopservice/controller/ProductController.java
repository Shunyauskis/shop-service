package com.koftachka.shopservice.controller;

import com.koftachka.shopservice.model.ProductDto;
import com.koftachka.shopservice.service.impl.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v2/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController (ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDto> getProduct(){
        return productService.getAll();
    }

//    @GetMapping
//    public ResponseEntity<List<ProductDto>> getAll() {
//        return ResponseEntity.ok(productService.getAll());
//    }
//    @GetMapping("/")
//    public String products(Model model){
//        model.addAttribute("products", productService.listProducts());
//        return "products";
//    }
//    @GetMapping("/product/{id}")
//    public String productInfo(@PathVariable Long id, Model model){
//        model.addAttribute("product", productService.getProductById(id));
//        return "product-info";
//    }
//
//    @PostMapping("/product/create")
//    public String createProduct(ProductDto product){
//        productService.saveProduct(product);
//        return "redirect:/";
//    }
//    @PostMapping("product/delete/{id}")
//    public String deleteProduct(@PathVariable Long id){
//        productService.deleteProduct(id);
//        return "redirect:/";
//    }
}
