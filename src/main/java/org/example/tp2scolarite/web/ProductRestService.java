package org.example.tp2scolarite.web;


import jakarta.persistence.MapKey;
import org.example.tp2scolarite.entities.Product;
import org.example.tp2scolarite.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product>  products(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product  findProducts(@PathVariable Long id){
        return productRepository.findById(id).get();
    }
}
