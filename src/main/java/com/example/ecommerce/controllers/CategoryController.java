package com.example.ecommerce.controllers;


import com.example.ecommerce.dto.category.CategoryHomeDTO;
import com.example.ecommerce.models.Category;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {


    @GetMapping
    public ResponseEntity<List<CategoryHomeDTO>> getAll(){

        return new ResponseEntity<>((List.of()), HttpStatus.OK);
    }

}
