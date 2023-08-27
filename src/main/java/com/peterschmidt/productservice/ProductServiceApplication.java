package com.peterschmidt.productservice;

import com.peterschmidt.productservice.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/product")
public class ProductServiceApplication {

	//test
	@RequestMapping("/{productId}")
	public Product getProduct(@PathVariable("productId") int id){
		return new Product(id,"iPhone", 999.99);
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}