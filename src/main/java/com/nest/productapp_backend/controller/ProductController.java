package com.nest.productapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/")
    public String Main_page(){
        return "WELCOME TO PRODUCT APP";
    }

    @PostMapping("/add")
    public String Add_page(){
        return "This is add_product page";
    }
}
