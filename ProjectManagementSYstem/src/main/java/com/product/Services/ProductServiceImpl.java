package com.product.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Entity.Product;
import com.product.Exception.ResourceNotFoundException;
import com.product.Repo.IProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	IProductRepository iProductRepository;

	@Override
	public Integer addProduct(Product product) {
		Product addProduct = iProductRepository.save(product);
		return addProduct.getProductId();		
	}

	@Override
	public List<Product> getAllProducts() {
		return iProductRepository.findAll();
	}

	@Override
	public Optional<Product> getproductById(Integer pId) {
		return iProductRepository.findById(pId);
	}

	@Override
	public Product updateProduct(Product product, Integer pId) {
		Product existingProduct = iProductRepository.findById(pId).orElseThrow(
				()-> new ResourceNotFoundException("Product", "pId", pId));
		existingProduct.setProductName(product.getProductName());
		existingProduct.setProductPrice(product.getProductPrice());
		existingProduct.setProductCategory(product.getProductCategory());
		existingProduct.setProductBrand(product.getProductBrand());	
		iProductRepository.save(existingProduct);
		return existingProduct;
	}

	@Override
	public void deleteProduct(Integer pId) {
		iProductRepository.deleteById(pId);	
	}

	@Override
	public void deleteAllProduct() {
		iProductRepository.deleteAll();
		
	}


}
