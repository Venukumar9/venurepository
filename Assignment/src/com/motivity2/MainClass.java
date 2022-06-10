package com.motivity2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee emp = new Employee();
       emp.get(912, "Venukumar");
       emp.get("MotivityLabs", 904);
       emp.get(903, "Satya", 3.0);
       emp.get(905, "motivityLabs", 3.0, "Associate Software engineer");
	}

}
