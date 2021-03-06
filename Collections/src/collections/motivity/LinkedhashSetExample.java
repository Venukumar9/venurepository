package collections.motivity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class LinkedhashSetExample {

	public static void main(String[] args) {
		List<String> l= new ArrayList<>();
		l.add("venu");
		l.add("satya");
		l.add("hari");
		l.add("sai");
		l.add("nikhil");
		l.add("sai");
		l.add(null);
		System.out.println(l);
		
		System.out.println("to find the element at a particular index: "+l.get(2));
		System.out.println("to find the class for a given object : "+l.getClass());
		System.out.println("lastindexof used to find if there is a repeated values in list it is used to find the last value index : "+l.lastIndexOf("sai"));
        LinkedList<Integer>l1 = new LinkedList<Integer>();
        l1.add(12);
        l1.add(56);
        l1.add(76);        
        l1.add(52);
        l1.add(6);
        System.out.println("-------------------------------");
        System.out.println(l1);
        l1.add(2, 11);
        System.out.println("used to add element at particular index position : "+l1);
        l1.clear();
       System.out.println("clear is used to clear all the elements from list : "+l1);

       System.out.println("contians retrun t / f where elements list1 is present in list 2 r not"+l1.contains(l));
       System.out.println("----------------------------------------------");
       
       LinkedHashSet<String> s = new LinkedHashSet<String>();
       s.add("bunty");
       s.add("Ram");
       s.add("Sonu");
       s.add("satya");
       s.add("lolli");
       s.add("ninty");
       s.add("lucky");
       s.add("john");
       System.out.println(s);
       System.out.println("------------------------------------------------");
       System.out.println(s.contains("john"));
       System.out.println("------------------------------------------------");
       System.out.println(s.equals(l1));
       System.out.println("------------------------------------------------");
       System.out.println( s.clone());
       System.out.println("------------------------------------------------");
       System.out.println( s.getClass());
       System.out.println("------------------------------------------------");
       System.out.println(s.containsAll(l1));
       System.out.println("------------------------------------------------");
       System.out.println( s.isEmpty());
       System.out.println("------------------------------------------------");
       System.out.println(  s.hashCode());
       System.out.println("------------------------------------------------");
       System.out.println(s.remove("ninty"));
       System.out.println("------------------------------------------------");
       System.out.println(s.size());
       
        
	}

}
