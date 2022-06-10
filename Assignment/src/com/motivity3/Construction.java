package com.motivity3;

public class Construction {
public void roadConstruction() {
	System.out.println("reqired labours for construction");
}
}
class Road extends Construction {
public void roadConstruction() {
	System.out.println("required machines for laying ");
}
}
