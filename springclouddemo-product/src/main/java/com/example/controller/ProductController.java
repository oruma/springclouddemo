package com.example.controller;

import com.example.demo.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping(method = RequestMethod.GET,value="/getProduct")
    public String getProduct(){
        Product product = new Product();
        return product.toString();
    }
}
