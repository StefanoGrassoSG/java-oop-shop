package org.lessons.java.shop;

import java.util.Random;

public class Product {
	private int code;
	private String name;
	private String description;
	private double price;
	private static int vat;
	
	public Product(String name, String description, double price) {
		setCode(code);
		setName(name);
		setDescription(description);
		setPrice(price);
	}
	
	public int getCode() {
		
		return code;
	}
	private void setCode(int code) {
		Random rnd = new Random();
		this.code = rnd.nextInt(1, 100);
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getDescription() {
		
		return description;
	}
	public void setDescription(String description) {
		
		this.description = description;
	}
	public double getPrice() {
		
		return price;
	}
	public void setPrice(double price) {
		
		this.price = price;
	}
	
	public double getVatPrice() {
		
		return getPrice() * 1.21;
	}
	
	public String getFullName() {
		
		return getCode() + "-" + getName();
	}
	
	@Override
	public String toString() {
		
		return "Product:\n"
				+ "code: " + getCode() + "\n"
				+ "name: " + getName() + "\n"
				+ "description: " + getDescription() + "\n"
				+ "price: " + String.format("%.02f", getPrice()) + "$\n"
				+ "------------------------------------------\n"
				+ "price with VAT: " + String.format("%.02f", getVatPrice()) + "$\n"
				+ "Full Name: " + getFullName() + "\n";
	}
}
