package com.hotel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.model.Menu;
@Service
public class MenuService {
	List<Menu> ml;
	public MenuService() {
		ml=new ArrayList<>();
		ml.add(new Menu(1,"Pizza","Cheesy"));
		ml.add(new Menu(2,"Burger","Double Layered"));
		ml.add(new Menu(3,"Biriyani","Flavoured"));
		ml.add(new Menu(4,"Chicken wings","Crispy"));
	}
	public List<Menu> getMl() {
		return ml;
	}
	public void setMl(List<Menu> ml) {
		this.ml = ml;
	}
	public String editMenuItem(int id, Menu menu) {
		for(Menu m:ml) {
			if(m.getId()==id) {
				if(menu.getName()!=null) {
					m.setName(menu.getName());
				}
				if(menu.getDescription()!=null) {
					m.setDescription(menu.getDescription());
				}
				return "Successfully edited the values of menu item\n"+m.toString();
			}
		}
		return null;
	}
}
