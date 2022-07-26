package com.assignment;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicate {

	 public static void main(String[] args) 
	    {
	        LinkedList<Integer> duplicateElements = new LinkedList<Integer>();
	        duplicateElements.add(1);
	        duplicateElements.add(2);
	        duplicateElements.add(3);
	        duplicateElements.add(4);
	        duplicateElements.add(1);
	        duplicateElements.add(3);
	        duplicateElements.add(1);
	        
	        System.out.println("Elements from LinkedList: "+ duplicateElements);
	        
	        LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>(duplicateElements);
	        System.out.println("Elements from LinkedHashSet: "+ hashSet);
	    }
}
