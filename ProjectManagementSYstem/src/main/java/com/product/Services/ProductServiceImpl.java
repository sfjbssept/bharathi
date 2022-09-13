package com.product.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Entity.Product;
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


}
