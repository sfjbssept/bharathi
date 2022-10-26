package com.lambda.repo;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.lambda.entity.Order;

@Repository
public class OrderRepo {

	
	public List<Order> buildOrders() {
		return Stream.of(
				new Order(101, "Samsung Galaxy", 10000, 1),
				new Order(201, "Sony Bravio", 30000, 3),
				new Order(301, "LG", 25000, 2),
				new Order(501, "iPhone 13", 65000, 5)
				).collect(Collectors.toList());
	}
}