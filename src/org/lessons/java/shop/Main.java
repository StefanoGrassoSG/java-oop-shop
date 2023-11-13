package org.lessons.java.shop;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		final int PRODUCTS_COUNT = 20; 
		Random rnd = new Random();
		for(int x=0;x<=PRODUCTS_COUNT;x++) {
			Product p = new Product("cappello", "molto bello", 19.90);
			System.out.println(p + "\n------------------------------------------\n");
		}
		
	}
}
