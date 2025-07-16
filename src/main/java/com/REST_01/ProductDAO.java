package com.REST_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductDAO {
	
	public List<Product> productList = new ArrayList<Product>();
	
	ProductDAO(){
		Product p1 = new Product(1,"Air Fryers", 2500);
		Product p2 = new Product(2,"Microwave Oven", 15000);
		productList.addAll(Arrays.asList(p1,p2));
	}
	
	public List<Product> getAllProduct() {
		return productList;
	}

}
