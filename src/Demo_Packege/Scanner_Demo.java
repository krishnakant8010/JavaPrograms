package Demo_Packege;

import java.util.Scanner;

public class Scanner_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,Sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a=sc.nextInt();
		System.out.println("Enter Scond Number : ");
		b=sc.nextInt();
		Sum=a+b;
		
		System.out.print("Addtion of two Number:" +Sum);
		sc.close();
	}

}
