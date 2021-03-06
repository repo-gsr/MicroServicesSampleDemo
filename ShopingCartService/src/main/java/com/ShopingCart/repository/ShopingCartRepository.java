package com.ShopingCart.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ShopingCart.entity.Item;

@Repository
public class ShopingCartRepository {
	public List<Item> getCartItems() {

		List<Item> items = new ArrayList<Item>();
		
		Item item2 = new Item();
		item2.setId(1);
		item2.setName("Phone");
		item2.setBrand("Samsung");
		item2.setColor("black");
		item2.setPrice(35000L);
		
		Item item3 = new Item();
		item3.setId(1);
		item3.setName("Phone");
		item3.setBrand("Samsung");
		item3.setColor("black");
		item3.setPrice(35000L);
		
		Item item4 = new Item();
		item4.setId(1);
		item4.setName("Phone");
		item4.setBrand("Samsung");
		item4.setColor("black");
		item4.setPrice(35000L);

		items.add(item2);
		items.add(item3);
		items.add(item4);
		

		return items;
	}

}
