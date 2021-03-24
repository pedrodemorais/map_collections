package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String,String> cookies = new TreeMap<>();
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "999966558");
		
		System.out.println("Todos os Cookies");
		for(String x: cookies.keySet()) {
			System.out.println(x+": "+cookies.get(x));
			
		}
		
		cookies.remove("email");
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Todos os Cookies menos o email");
		
		for(String key: cookies.keySet()) {
			System.out.println(key+ ": "+cookies.get(key));
			
		}
		
		System.out.println("\nContem phone? "+cookies.containsKey("phone"));
		System.out.println("Tamanho: "+ cookies.size());
		
		

	}

}
