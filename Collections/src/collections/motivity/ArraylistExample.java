package collections.motivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraylistExample {

	public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();

	a.add(9);
	a.add(6);
	a.add(4);
	a.add(4);
	a.add(3);
	a.add(1);
	System.out.println(a);
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	a2.add(3);
	a2.add(12);
	a.addAll(a2);
	System.out.println("to add both list1 and list2 : "+a);
	a2.clear();
	System.out.println("to clear list "+a2);
	ArrayList<Integer> cloneList=  (ArrayList<Integer>)a.clone();
	System.out.println("Clone->to store a exact copy in new list : "+cloneList);
	System.out.println("-----------------------------------------------------");
	System.out.println(a.contains(4));
	System.out.println("-----------------------------------------------------");
	System.out.println(a.indexOf(4));
	System.out.println("-----------------------------------------------------");
	System.out.println(a.indexOf(6)>0);
	System.out.println("------------------------------------------------------");
	
	ArrayList<String> s = new ArrayList<String>();
	s.add("venu");
	s.add("pavan");
	s.add("ram");
	s.add("pavan");
	System.out.println(s);
	System.out.println("-------------------------------------------------------");
	System.out.println(s.lastIndexOf("pavan"));
	System.out.println("-------------------------------------------------------");
	s.remove(1);
	System.out.println(s);
	System.out.println("--------------------------------------------------------");
	s.remove("ram");
	System.out.println(s);
	System.out.println("--------------------------------------------------------");
	a.removeIf(num->num%2==0);//removed all even number from the list
	System.out.println(a);
	System.out.println("---------------------------------------------------------");
	ArrayList<Integer> a1 = new ArrayList<>();
	a1.add(12); 
	a1.add(13);
	System.out.println(a1);
	a1.removeIf(num->num%2==1);//removed all odd number from the list
	System.out.println(a1);
	System.out.println("---------------------------------------------------------");
	
	ArrayList<String> s1 = new ArrayList<String>();
	s1.add("ram");
	s1.add("pavan");
	s1.add("ram");
	System.out.println(s1);
	s1.retainAll(Collections.singleton("ram"));
	System.out.println(s1);//it is used to give or retain  a particular elements which u want from the list...
	System.out.println("----------------------------------------------------------");
	ArrayList<Integer> ar = new ArrayList<>();
	ar.add(10);
	ar.add(2);
	ar.add(5);
	ar.add(8);
	ar.add(9);
	System.out.println(ar);
	ArrayList<Integer> subArraYList = new ArrayList<>(ar.subList(1, 3));
	System.out.println(subArraYList);//to print sub array list
	
	
	
	
	
	
	

	}

}
