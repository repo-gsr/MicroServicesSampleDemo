package com.ShopingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ShopingCart.entity.Item;
import com.ShopingCart.repository.ShopingCartRepository;

@Service
public class ShopingCartServiceImpl implements ShopingCartService {

	@Autowired
	public ShopingCartRepository shopingcartrepository;

	@Override
	public List<Item> getOrderedItems() {
		return shopingcartrepository.getOrderedItems();
	}

}
