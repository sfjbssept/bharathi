package com.product.Services;

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
		// TODO Auto-generated method stub
		Product addProduct = iProductRepository.save(product);
		return addProduct.getProductId();		
	}

}
