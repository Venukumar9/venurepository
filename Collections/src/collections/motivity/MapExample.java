package collections.motivity;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(5, "navin");
		hm.put(6, "bunty");
		hm.put(10, "chanti");
		hm.put(25, "john");
		hm.put(45, "pavan");
		hm.put(65, "Ram");
		hm.put(75, "gopy");
		System.out.println(hm);
		System.out.println("-------------------------------------");
		System.out.println(hm.get(6));
		System.out.println("-------------------------------------");
		hm.remove(10);
		System.out.println(hm);
		System.out.println("-------------------------------------");
		System.out.println(hm.containsKey(6));
		System.out.println("-------------------------------------");
		System.out.println(hm.containsKey(hm));
		System.out.println("-------------------------------------");
		System.out.println(hm.values());//to get values as collection not in form of set
		System.out.println("-------------------------------------");
		System.out.println(hm.keySet());//to get keys 
		System.out.println("-------------------------------------");
		System.out.println(hm.isEmpty());
		System.out.println("-------------------------------------");
	    System.out.println(hm.entrySet());//return all the entries as a set
	    for(int k:hm.keySet())
	    {
	    	System.out.println(k);//we get in the form of values
	    }
	    System.out.println("-------------------------------------");
	    for(String j:hm.values())
	    {
	    	System.out.println(j);
	    }
	    System.out.println("-------------------------------------");
	    for(Object a:hm.keySet())
	    {
	    	System.out.println(a+" "+hm.get(a));
	    }
	    
	    		
		

	}

}
