package com.hotel.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.hotel.model.Menu;
import com.hotel.service.CartService;
import com.hotel.service.MenuService;

@RestController
public class App {
	@Autowired
	MenuService ms;
	
	@Autowired
	CartService cl;
	@GetMapping("/")
	public String home() {
		return "Welcome to Hotel Service";
	}
	
	@GetMapping("/menus")
	public List<Menu> viewMenuIemList(){
		return ms.getMl();
	}
	@PutMapping("/menus/{id}")
	public String editMenuItem(@PathVariable int id,@RequestBody Menu menu) {
		String res=ms.editMenuItem(id, menu);
		if(res!=null) {
			return res;
		}
		return "Failed!!! Menu item not found";
	}
	@GetMapping("/cart")
	public List<Menu> viewCart(){
		
		return cl.viewCart(ms.getMl());
	}
	@PutMapping("/cart/{id}")
	public String addItemCart(@PathVariable int id) {
		return cl.addItemCart(id,ms.getMl());
	}
	@DeleteMapping("/cart/{id}")
	public String removeItemCart(@PathVariable int id) {
		return cl.removeItemCart(id);
	}
}
