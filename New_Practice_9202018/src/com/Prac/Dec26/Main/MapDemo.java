package com.Prac.Dec26.Main;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		
		m.put("AA", 10);
		m.put("BB", 20);
		m.put("CC", 30);
		m.put("DD", null);
		m.put("EE", null);
		m.put(null, 40);
		m.put(null, 50);
		
		System.out.println(m);
		

	}

}
