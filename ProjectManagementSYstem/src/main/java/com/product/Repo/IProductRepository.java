package com.product.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.Entity.Product;



public interface IProductRepository extends JpaRepository<Product, Integer> {

}
