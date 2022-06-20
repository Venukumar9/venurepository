package com.assignment;

import java.util.LinkedList;

public class LinkedAssignment {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> list =new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(34);
		list.add(35);
		list.add(20);
		list.add(36);
		list.add(11);
		list.add(15);

		System.out.println(list);
	
		int k=3;
		System.out.println(list.size()-k);
		while(k !=0)
		{
		list.addFirst(list.removeLast());
		k--;
		}
		System.out.println(list);
		}
		

}

	


