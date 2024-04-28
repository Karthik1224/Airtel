package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
	
	private List<Object>purchaseProducts = new ArrayList<>();
	
	public void addProducts()
	{
		purchaseProducts.add("99999");
		purchaseProducts.add(1);
		
	}
	
	public void getProducts()
	{
		for(Object val : purchaseProducts)
		{
			System.out.println(val);
		}
	}

}
