package com.hotel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.model.Menu;

@Service
public class CartService {
	

	List<Integer> cl;
	public CartService() {
		cl=new ArrayList<>();
		cl.add(1);
		
	}
	public List<Menu> viewCart(List<Menu> ml) {
		List<Menu> rl=new ArrayList<>();
		for(Integer i:cl) {
			for(Menu m:ml) {
				if(i==m.getId()) {
					rl.add(m);
				}
			}
		}
		return rl;
	}
	public String addItemCart(int id,List<Menu> ml) {
		for(Menu m:ml) {
			if(m.getId()==id) {
				cl.add(id);
				return "Successfully added "+m.toString()+" to the cart";
			}
		}
		return "Item not found";
	}
	public String removeItemCart(Integer id) {
		if(cl.contains(id)) {
			cl.remove(id);
			return "Successfully Removed item from cart";
		}
		return "Item not found in cart";
	}

}
