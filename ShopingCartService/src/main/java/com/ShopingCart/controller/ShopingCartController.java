package com.ShopingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ShopingCart.entity.Item;
import com.ShopingCart.service.ShopingCartServiceImpl;

@RestController
public class ShopingCartController {

	@Autowired
	public ShopingCartServiceImpl shopingCartServiceImpl;

	@GetMapping(path = "/getCartProducts")
	public List<Item> getAllItems(Model model) {
		return shopingCartServiceImpl.getCartItems();
	}
}
