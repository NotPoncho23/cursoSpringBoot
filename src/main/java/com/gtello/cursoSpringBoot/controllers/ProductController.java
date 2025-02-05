package com.gtello.cursoSpringBoot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtello.cursoSpringBoot.configurations.ExternalizedConfigurationi;
import com.gtello.cursoSpringBoot.domain.Product;
import com.gtello.cursoSpringBoot.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    @Lazy
    // @Qualifier("jsonResourceList")
    private ProductService productsService;

    private ExternalizedConfigurationi externalizedConfigurationi;

    @GetMapping
    public ResponseEntity<?> getProducts(){
        System.out.println(externalizedConfigurationi.toString());
        List<Product> products = productsService.getProducts();
        return ResponseEntity.ok(products);
    }
}
