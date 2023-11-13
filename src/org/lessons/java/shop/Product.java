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
		this.code = rnd.nextInt(100, 1001);
	}
	private String setCodePad() {
		
	    return String.format("%08d", getCode());
	}

	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		if(name.length() < 128 && name.length() > 0) {
			this.name = name;
		}
	}
	public String getDescription() {
		
		return description;
	}
	public void setDescription(String description) {
		if(description.length() < 500 && description.length() > 0) {
			this.description = description;
		}
	}
	public double getPrice() {
		
		return price;
	}
	public void setPrice(double price) {
		if(price > 0.01) {
			this.price = price;
		}
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
				+ "price with VAT: " + String.format("%.02f", getVatPrice()) + "$\n"
				+ "Full Name: " + getFullName() + "\n"
				+ "pad code: " + setCodePad() + "\n";
	}
}
