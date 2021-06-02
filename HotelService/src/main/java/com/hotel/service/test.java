package com.hotel.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,4));
		System.out.println(l);
		System.out.println(l.contains(Integer.valueOf(1)));
		l.remove(Integer.valueOf(1));
		System.out.println(l);
	}

}
