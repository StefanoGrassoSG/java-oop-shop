package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
			Product p = new Product("cappello", "molto bello", 19.90, 20);
			System.out.println(p + "\n------------------------------------------");
			
			
			p.setName("borsa");
			p.setDescription("molto brutta");
			p.setPrice(2);
			p.setVat(30);
			System.out.println(p);
		}
		
}
