package com.ShopingCart.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.ShopingCart.entity.Item;

@Repository
public class ShopingCartRepository {

	@Autowired
	RestTemplate restTemplate;

	@Value("${product.service-url}")
	private String product_service_url;

	@Value("${order.service-url}")
	private String ordered_service_url;

	@Value("${cart.service-url}")
	private String cart_service_url;

	public List<Item> getProducts() {
		Item[] items = restTemplate.getForObject(product_service_url + "/getProducts", Item[].class);
		return Arrays.asList(items);
	}
	
	public List<Item> getOrderedProducts() {
		Item[] items = restTemplate.getForObject(ordered_service_url + "/getOrderedProducts", Item[].class);
		return Arrays.asList(items);
	}
	
	public List<Item> getCartProducts() {
		Item[] items = restTemplate.getForObject(cart_service_url + "/getCartProducts", Item[].class);
		return Arrays.asList(items);
	}
}
