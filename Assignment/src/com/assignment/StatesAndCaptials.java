package com.assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StatesAndCaptials {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("telangana", "hyderabad");
		hm.put("andhraPradesh", "Amaravathi");
		hm.put("bihar", "patna");
		hm.put("tamilnadu", "chennai");
		hm.put("goa", "panaji");
		hm.put("uttarpradesh", "lucknow");
		hm.put("karnataka", "benglore");
		System.out.println(hm);
		System.out.println(hm.containsKey("telangana"));
		System.out.println(hm.containsValue("hyderabad"));
		
	
	
		for(Map.Entry<String, String> set:
			hm.entrySet()) {
		System.out.println(set.getKey()+" "+set.getValue());
			
		}
	}

}
