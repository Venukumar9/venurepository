package collections.motivity;

import java.util.LinkedHashMap;

public class LinkedHashmapExample {

	public static void main(String[] args) {
	LinkedHashMap<Integer, String> lm = new LinkedHashMap<Integer, String>();
	lm.put(2, "poshanna");
	lm.put(3, "linganna");
	lm.put(4, "ellanna");
	lm.put(5, "mallanna");
	lm.put(6, "ranganna");
	System.out.println(lm);
	System.out.println("----------------------------");
    System.out.println(lm.get(5));
    System.out.println("------------------------------");
    System.out.println(lm.size());
    System.out.println("--------------------------------");
    System.out.println(lm.isEmpty());
    System.out.println("--------------------------------");
    System.out.println(lm.containsKey(3));
    System.out.println("---------------------------------");
    System.out.println(lm.containsValue("ellanna"));
    System.out.println("----------------------------------");
    System.out.println(lm.remove(2));
    System.out.println("---------------------------------");
    System.out.println(lm);
    System.out.println("----------------------------------");
    System.out.println(lm.remove(3,"linganna"));
    System.out.println("-----------------------------------");
    System.out.println(lm);
	}

}
