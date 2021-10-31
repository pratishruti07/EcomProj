package com.sboot.Ecom.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.Ecom.dao.CartDao;
import com.sboot.Ecom.model.Cart;

@Service
public class CartService {
	
	@Autowired
	private CartDao cartDao;
	
	
	public void addToCart(Cart cart) {
		cartDao.save(cart);
	}
	
	
}
