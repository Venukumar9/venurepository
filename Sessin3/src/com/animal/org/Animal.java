package com.animal.org;

public abstract class Animal {
abstract void lifeSpan();
void breath() {
	System.out.println("breathes oxygen");
}
}
class Dog extends Animal {
	void lifeSpan() {
		System.out.println("lifespan of dog is 13 years");
	}
}
class Cat extends Animal {
	void lifeSpan (){
		System.out.println("lifeSpan of cat is 18 years");
		}
}
class Tiger extends Animal {
	void lifeSpan (){
		System.out.println("lifeSpan of Tiger is 16 years");
		}
}
class Lion extends Animal {
	void lifeSpan (){
		System.out.println("lifeSpan of lion is 16 years");
		}
}
class Deer extends Animal {
	void lifeSpan (){
		System.out.println("lifeSpan of cat is 20 years");
		}
}