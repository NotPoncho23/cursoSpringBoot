/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gtello.cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gtello
 */
@RestController
public class HelloWorldRestController {
    
    @GetMapping("/hello")
    public String helloWorld(){
        System.out.println("1");
        return "Hello world";
    }
}
