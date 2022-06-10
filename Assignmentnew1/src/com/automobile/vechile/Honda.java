package com.automobile.vechile;

import com.automobile.Vechile;

public class Honda extends Vechile {
	int speed;
 public int getSpeed(int speed) {
	 return speed;
 }
 public void cdplayer() {
	 System.out.println("provides facility to control the cd player which is avaliable in the car");
	 
 }
@Override
public String getModelName() {
	// TODO Auto-generated method stub
	return "DreamYuga";
}
@Override
public String getRegistrationNumber() {
	// TODO Auto-generated method stub
	return "ts21d5133";
}
@Override
public String getownereName() {
	// TODO Auto-generated method stub
	return "pavan";
}
}
