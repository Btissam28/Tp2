package org.example.tp2scolarite;

import org.example.tp2scolarite.entities.Category;
import org.example.tp2scolarite.entities.Product;
import org.example.tp2scolarite.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Tp2ScolariteApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {

        SpringApplication.run(Tp2ScolariteApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        //Category c1 = categoryRepository.save(new Category(null, "Informatique", null));
       // productRepository.save(new Product(null,"computer",4300,6));
       // productRepository.save(new Product(null,"Printer",5000,10));
        //productRepository.save(new Product(null,"PHONE",800,33));
        List<Product>  products = productRepository.findAll();
        products.forEach(p->System.out.println(p.toString()));

        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("***************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
        System.out.println("****************");

        List<Product> c = productRepository.findByNameContains("c");
        c.forEach(p->System.out.println(p.toString()));
        System.out.println("-----------------------");
        List<Product> c2 = productRepository.search("%c%");
        c2.forEach(p->System.out.println(p.toString()));

        System.out.println("-----------------------");
        List<Product> c3= productRepository.findByPriceGreaterThan(800);
        c3.forEach(p->System.out.println(p.toString()));
        System.out.println("-----------------------");
        List<Product> c4 = productRepository.searchByPrice(800);
        c4.forEach(p->System.out.println(p.toString()));









    }


}
