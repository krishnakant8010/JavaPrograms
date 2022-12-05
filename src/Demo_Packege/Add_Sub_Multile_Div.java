package Demo_Packege;

import java.util.Scanner;

public class Add_Sub_Multile_Div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum,subtraction,multile,divtion;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number: ");
		a=sc.nextInt();
		System.out.println("Enetr second Number: ");
		b=sc.nextInt();
		sum=a+b;
		subtraction=a-b;
		multile=a*b;
		divtion=a/b;
		System.out.println("Sum two number= " +sum);

		System.out.println("Sum two number= " + subtraction);
		
		System.out.println("Sum two number= " + multile);
	
		System.out.println("Sum two number= " + divtion);
		sc.close();
	}

}
