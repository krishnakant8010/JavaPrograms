package Demo_Packege;

import java.util.Scanner;

public class Max_number_from_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter first number");
		a=sc.nextInt();
		System.out.println("Enetr Second Number");
		b=sc.nextInt();
		
		if(a>b) {
			System.out.println("Max Number is " +a);
		}
		else {
			System.out.print("Max Number is " +b);
		} 
		sc.close();
	}

}
