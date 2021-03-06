package collections.motivity;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<Integer> l1 = new LinkedList<Integer>();
	l1.add(12);
	l1.add(2);
	l1.add(7);
	l1.add(14);
	System.out.println(l1);
	System.out.println(l1.size());
	System.out.println("-----------------------------------");
	System.out.println(l1.get(1));//to get wt value is there at a particular index..
	System.out.println("------------------------------------");
	Iterator<Integer> itr=l1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	System.out.println("----------------------------------");
	l1.add(3, 5);
	System.out.println(l1);//to add a elemnet at a particular index..
	LinkedList<String> s1 = new LinkedList<String>();
	s1.add("bunty");
	s1.add("posha");
	s1.add("linga");
	System.out.println("--------------------------------------");
	System.out.println(s1);
	s1.addFirst("rajanna");
	System.out.println(s1);
	System.out.println("---------------------------------------");
	s1.addLast("narsingulu");
	System.out.println(s1);
	s1.removeFirst();
	System.out.println(s1);
	s1.removeLast();
	System.out.println(s1);
	System.out.println("---------------------------------------");
	//reversing list
    Iterator<String> it = s1.descendingIterator();
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    System.out.println("------------------------------------------");
	//sorting
    Collections.sort(s1);
    System.out.println(s1);
    //random order
    Collections.shuffle(l1);
   System.out.println(l1);

	}

}
