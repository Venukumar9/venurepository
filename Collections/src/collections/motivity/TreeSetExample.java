package collections.motivity;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
	
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(2);
		t.add(10);
		t.add(21);
		t.add(7);
		t.add(22);
		t.add(24);
		System.out.println(t);
		System.out.println("-------------------------------------");
		for(int k:t) {
			System.out.println(k);
		}
		System.out.println("-------------------------------------");
		Iterator<Integer> a = t.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		System.out.println("-------------------------------------");
		TreeSet<Integer> head_set =  new TreeSet<Integer>();
		head_set = (TreeSet<Integer>)t.headSet(30);
		Iterator it = head_set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------------------------------");
		System.out.println(t.last());
		t.pollFirst();
		System.out.println("-------------------------------------");
		System.out.println(t);
		System.out.println("-------------------------------------");
		t.pollLast();
		System.out.println(t);
		System.out.println("-------------------------------------");
		System.out.println(t.subSet(1, 2));
		System.out.println("-------------------------------------");
		System.out.println(t.contains(21));
		System.out.println("-------------------------------------");
		System.out.println(t.remove(21));
		System.out.println(t);
		
		
		
		
		
		

	}

}
