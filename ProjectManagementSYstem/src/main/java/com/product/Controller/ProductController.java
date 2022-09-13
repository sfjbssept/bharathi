package com.product.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/update/{pId}")
	public ResponseEntity<Product> updateProduct(@PathVariable("pId") Integer pId, @RequestBody Product product){
		return new ResponseEntity<Product>(productService.updateProduct(product, pId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProduct/{pId}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("pId") Integer pId){
		ResponseEntity<Product> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			productService.deleteProduct(pId);
			
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return responseEntity;
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteALl(){
			productService.deleteAllProduct();			
	}
	
}
