package com.product.Services;

import java.util.List;
import java.util.Optional;

import com.product.Entity.Product;

public interface ProductService {
	
	Integer addProduct(Product product);
	
	List<Product> getAllProducts();
	
	Optional<Product> getproductById(Integer pId);
	
	Product updateProduct(Product product, Integer pId);
	
	void deleteProduct(Integer pId);
	
	void deleteAllProduct();

}
