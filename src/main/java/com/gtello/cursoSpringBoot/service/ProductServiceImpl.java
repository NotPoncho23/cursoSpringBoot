package com.gtello.cursoSpringBoot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gtello.cursoSpringBoot.domain.Product;

public class ProductServiceImpl {
    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(1, "pru1", 10.0, 100),
        new Product(2, "pru2", 20.0, 200),
        new Product(3, "pru3", 30.0, 300),
        new Product(4, "pru4", 40.0, 400)
    ));
    
}
