package twowheeler;

import com.automobile.Vechile;

public class Hero extends Vechile {
	int speed;
	public int getSpeed(int speed) {
	  return speed;
		
		}
	public void radio() {
		System.out.println("provides facility to control the radio device");
		
	}
	
	
	@Override
	
	public String getModelName() {
		return "hf Delax";
		
		
	}
	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "ts210883";
	}
	@Override
	public String getownereName() {
		// TODO Auto-generated method stub
		return "venu";
	}

}
