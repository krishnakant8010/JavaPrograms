package Demo_Packege;

import java.util.Scanner;

public class Max_number_from_fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter first number");
		a=sc.nextInt();
		System.out.println("Enetr Second Number");
		c=sc.nextInt();
		System.out.println("Enetr Second Number");
		d=sc.nextInt();
		System.out.println("Enetr Second Number");
		b=sc.nextInt();
		
		if(a>b && b>c & c>d) {
			System.out.println("Max Number is " +a);
		}else if(b>c&&b>d&b>a) {
			System.out.println("Max Number is " +b);
		}
		else if(c>d&&c>b&&c>a) {
			System.out.println("Max Number is " +c);
		}
		
		else {
			System.out.print("Max Number is " +d);
		} 
		sc.close();	
	}

}
