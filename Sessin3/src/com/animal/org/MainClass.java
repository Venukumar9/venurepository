package com.animal.org;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Animal animal =  new Dog();
         animal.lifeSpan();
         animal.breath();
         
         animal = new Cat();
         animal.lifeSpan();
         animal.breath();
                 
         animal = new Lion();
         animal.lifeSpan();
         animal.breath();
               
         animal = new Tiger();
         animal.lifeSpan();
         animal.breath();
                
          animal = new Deer();
         animal.lifeSpan();
                 animal.breath();
	}

}
