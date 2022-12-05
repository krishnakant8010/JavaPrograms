package Demo_Packege;

import java.util.Scanner;

public class Calculator_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr fist Number: ");
		a=sc.nextInt();
		System.out.println("Eneter Scond number: ");
		b=sc.nextInt();
		
		System.out.println("Enetr Your Choice ->1 add 2->Subtarct ->3 Multiply ->4 Divide \n Enter Your choice: ");
		ch=sc.nextInt();
		if(ch==1) {
			System.out.println("Addition: " +(a+b));
		}
		else if(ch==2) {
			System.out.println("Subtraction: " +(a-b));
		}
		else if(ch==3) {
			System.out.println("Pultiplication:- " +(a*b));
		}
		else if(ch==4) {
			System.out.println("Divsion:" +(a/b));
		}
		else {
			System.out.println("Invalid choice");
		}sc.close();
	}

}
