package com.automobile.vechile;

import twowheeler.Hero;

public class Test {

	public static void main(String[] args) {
		Hero h = new Hero();
		System.out.println("the speed of hero vechile is : "+h.getSpeed(100));
		System.out.println("the modelname of hero vechile is :"+h.getModelName());
		System.out.println("the registation number is : "+h.getRegistrationNumber());
		System.out.println("the owner name of hf delax is : "+h.getownereName());
	    h.radio();
		
		Honda h1 = new Honda();
		System.out.println("the speed of honda vechile is : "+h1.getSpeed(100));
		System.out.println("the modelname of honda vechile is :"+h1.getModelName());
		System.out.println("the registation number is : "+h1.getRegistrationNumber());
		System.out.println("the owner name of honda delax is : "+h1.getownereName());
	    h1.cdplayer();
		

	}

}
