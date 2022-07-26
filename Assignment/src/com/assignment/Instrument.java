package com.assignment;

public abstract class Instrument {
	
	abstract  void play();

}
class Piono extends Instrument {
	void play() {
		System.out.println("tan tan tan tan ");
	}
}
class Flute extends Instrument {
	void play() {
		System.out.println("toot toot toot toot");
	}
			
			
}
class Guiter extends Instrument {
	void play() {
		System.out.println("tin tin ");
	}
}
