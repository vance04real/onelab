package com.persistantcoder.onelab.controller;

import com.persistantcoder.onelab.beans.Product;
import com.persistantcoder.onelab.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Evans K F C on May ,2020
 **/
@Controller
public class SearchController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/search")
    public String search(@RequestParam("search")String search , Model model){
        System.out.println("search criteria " + search);

        List<Product> products = new ArrayList<>();

        products = productRepository.searchByName(search);
        model.addAttribute("products",products);


        return  "search";
    }



}
