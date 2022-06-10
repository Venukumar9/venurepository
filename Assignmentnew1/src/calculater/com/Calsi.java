package calculater.com;
class Calculator {
	static int powerInt(int num1 ,int num2)
	{
		return (int)Math.pow(num1,num2);
	}
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1, num2);
	}
}

public class Calsi {

	public static void main(String[] args) {
		Calculator c = new Calculator();
     
		System.out.println("the value of 10 power 5 is : "+c.powerInt(10, 5));
		System.out.println("the value of 7.6 to the power 2.3 is : "+c.powerDouble(7.6, 2.3));

	}

}
