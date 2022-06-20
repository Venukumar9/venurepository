import java.util.Scanner;

public class withoutusingMultiDiviMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your divident");
		int X=sc.nextInt();
		System.out.println("enter your divisor");
		int Y=sc.nextInt();
		int sign=0;
		int temp=0;
		if(Y<0){
		sign++;
		Y=Y*-1;
		}
		if(X<0){
		sign++;
		X=X*-1;
		} while(X>=Y)
		{
		X=X-Y;
		temp++;
		}
		if(sign==1)
		System.out.println("answer is "+-temp);
		else
		System.out.println("answer "+temp);



	
	}

}
