package collections.motivity;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QuaueExample {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue();
		q.add(23);
		q.add(21);
		q.add(13);
		q.add(27);
		q.add(43);
		q.add(83);
		q.add(29);
		q.add(22);
		System.out.println(q);
		System.out.println("------------------------------------------------------------------------");
		q.offer(1);
		System.out.println(q);//offer is also usedto add element 
		System.out.println("------------------------------------------------------------------------");
		System.out.println(q.element());//it return header element if queue is empty it returns exception
		System.out.println("------------------------------------------------------------------------");
		System.out.println(q.peek());//it also return header element if queue is empty it return null
		System.out.println("------------------------------------------------------------------------");
		System.out.println(q.remove());//return 1st element and remove 1st element from the queue 
		System.out.println("------------------------------------------------------------------------");
		System.out.println(q);
		System.out.println("------------------------------------------------------------------------");
		System.out.println(q.poll());//return 1st element and removes 1st element from queue
		System.out.println("------------------------------------------------------------------------");
		System.out.println(q);
		Iterator it = q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------------------------------------------------------------------------");
		PriorityQueue a = new PriorityQueue();
		a.add(100);
		a.add(120);
	//	a.add("venu");In priorityQueue we cannot store different datatypes values(Only Homogeneous elements)
		System.out.println(a);
		System.out.println("------------------------------------------------------------------------");
		Queue a1 = new LinkedList();
		a1.add(10);
		a1.add(10);
		a1.add("venu");
		a1.add("john");
		System.out.println(a1);//in linkedlist both homogeneous&heterogenous are elements are allowed.
		
		

	}

}
