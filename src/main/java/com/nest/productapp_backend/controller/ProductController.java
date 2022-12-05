package com.nest.productapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String Main_page(){
        return "WELCOME TO PRODUCT APP";
    }

    @PostMapping("/add")
    public String Add_page(){
        return "This is add_product page";
    }

    @PostMapping("/search")
    public String Search_page(){
        return "This is search_product page";
    }

    @PostMapping("/edit")
    public String Edit_page(){
        return "This is Edit_product_details page";
    }

    @PostMapping("/delete")
    public String Delete_page(){
        return "This is Delete_product page";
    }

}
