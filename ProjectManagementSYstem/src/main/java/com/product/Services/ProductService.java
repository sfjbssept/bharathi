package com.product.Services;

import java.util.List;
import java.util.Optional;

import com.product.Entity.Product;

public interface ProductService {
	
	Integer addProduct(Product product);
	
	List<Product> getAllProducts();
	
	Optional<Product> getproductById(Integer pId);

}
