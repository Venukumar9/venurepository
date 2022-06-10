package com.motivity;

public class ArrayStoreExceptionExample {

	public static void main(String[] args) {
		Object [] stringArr = new String[5];
		
         stringArr[0]="hello";
         System.out.println(stringArr[0]);
         try {
        	 stringArr[1]=100;
             System.out.println(stringArr[1]);
         }
         catch(ArrayStoreException e)
         {
        	 System.out.println("array store exception handled...");
         }
         
	}

}
