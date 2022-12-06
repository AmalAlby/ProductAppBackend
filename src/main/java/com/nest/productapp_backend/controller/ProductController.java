package com.nest.productapp_backend.controller;

import com.nest.productapp_backend.dao.ProductDao;
import com.nest.productapp_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao dao;

    @GetMapping("/")
    public String Main_page(){
        return "WELCOME TO PRODUCT APP";
    }

    @PostMapping(path="/add",consumes ="application/json",produces ="application/json" )
    public String Add_page(@RequestBody Product p){
        System.out.println(p.getProductCode());
        System.out.println(p.getProductName());
        System.out.println(p.getManufDate());
        System.out.println(p.getExpDate());
        System.out.println(p.getBrand());
        System.out.println(p.getSellerName());
        System.out.println(p.getPrice());
        System.out.println(p.getDistributor());
        dao.save(p);
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

    @GetMapping("/view")
    public List<Product> View_page(){
        return (List<Product>) dao.findAll();
    }
}
