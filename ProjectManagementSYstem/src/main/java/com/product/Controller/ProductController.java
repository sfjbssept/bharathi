package com.product.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/getAllProducts")
	List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@GetMapping("/getProduct/{pId}")
	Optional<Product> getProduct(@PathVariable Integer pId) {
		 return productService.getproductById(pId);
	}
	
}
