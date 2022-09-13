package com.product.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.Entity.Product;
import com.product.Services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;

	@PostMapping("/addProduct")
	Integer addProduct(@RequestBody Product product) {
		Integer id = productService.addProduct(product);
		System.out.println(id + "Product Id");
		return id;
	}
	
}
