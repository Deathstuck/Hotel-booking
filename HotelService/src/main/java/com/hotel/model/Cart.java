package com.hotel.model;

import java.util.List;

public class Cart {

	List <Menu> cartMenu;

	public Cart(List<Menu> cartMenu) {
		super();
		this.cartMenu = cartMenu;
	}

	public List<Menu> getCartMenu() {
		return cartMenu;
	}

	public void setCartMenu(List<Menu> cartMenu) {
		this.cartMenu = cartMenu;
	}

	@Override
	public String toString() {
		return "Cart [cartMenu=" + cartMenu + "]";
	}
	
}
