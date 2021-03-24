package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import entities.Product;

public class Program_Product {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Map<Product, Double> stok = new HashMap<>();
		
		Product p1 = new Product("TV",900.00);
		Product p2 = new Product("NoteBook",1200.00);
		Product p3 = new Product("Tablet",400.00);
		
		stok.put(p1, 10000.00);
		stok.put(p2, 11000.00);
		stok.put(p3, 15000.00);
		
		Product ps = new Product("TV",900.00);
		
		System.out.println("Contains 'ps' key: "+stok.containsKey(ps));

	}

}
