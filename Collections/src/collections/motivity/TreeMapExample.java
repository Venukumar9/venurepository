package collections.motivity;

import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		m.put(100, "bunty");
		m.put(101, "venu");
		m.put(102, "ram");
		m.put(103, "posha");
		m.put(104, "navin");
		m.put(105, "pavan");
		m.put(106, "lucky");
		m.put(100, "manu");
		System.out.println(m);
		System.out.println("------------------------------------");
	    for(Map.Entry e:m.entrySet()) {
	    	System.out.println(e.getKey()+" "+e.getValue());
	    }
	    System.out.println("-----------------------------------------");
	    m.putIfAbsent(3, "hari");
	    System.out.println(m);
	    System.out.println("---------------------------------------------");
	    m.putIfAbsent(3, "k");
	    System.out.println(m);
	    System.out.println("---------------------------------------------");
	    m.putIfAbsent(7, "hari");
	    System.out.println(m);
	    System.out.println("---------------------------------------------");
	    m.ceilingEntry(6);
	    System.out.println(m);
	    System.out.println("-------------------------------------------------");
	    TreeMap<Integer, String> t1=new TreeMap<Integer, String>();
	    t1.put(2, "jacky");
	    t1.put(4, "mocey");
	    
	    NavigableSet<Integer> n = m.descendingKeySet();
	    System.out.println(n);//decending order of keys
	    System.out.println("-------------------------------------------------");
	    System.out.println(t1);
	    System.out.println("-------------------------------------------------");
	    System.out.println(t1.containsKey(2));
	    System.out.println("-------------------------------------------------");
	    System.out.println(t1.get(2));
	    System.out.println("-------------------------------------------------");
	    System.out.println(t1.remove(2));
	    System.out.println("-------------------------------------------------");
	    System.out.println(t1);

	}

}
