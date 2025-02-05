package com.gtello.cursoSpringBoot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.gtello.cursoSpringBoot.domain.Product;

@Lazy
@Service
@ConditionalOnProperty(name = "service.products", havingValue = "list")
public class ProductServiceImpl implements ProductService{
    public ProductServiceImpl() {
        System.out.println("ProductServiceImpl");
    }

    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(1, "pru1", 10.0, 100),
        new Product(2, "pru2", 20.0, 200),
        new Product(3, "pru3", 30.0, 300),
        new Product(4, "pru4", 40.0, 400)
    ));
    
    @Override
    public List<Product> getProducts(){
        return products;
    }

}
