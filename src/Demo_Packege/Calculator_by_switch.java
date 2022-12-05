package Demo_Packege;

import java.util.Scanner;

public class Calculator_by_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		a=sc.nextInt();
		System.out.println("Eneter Second Number:");
		b=sc.nextInt();
		System.out.println("Enter your choice nubmber ->1 Addition 2->Subtract 3-> Multiply ->4 Divide \n Please enter any choice:");
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:{
			System.out.println("Addition:" +(a+b));
			break;
		}
		case 2:{
			System.out.println("Addition:" +(a-b));
			break;
		}
		case 3:{
			System.out.println("Subtraction:" +(a*b));
			break;
		}
		case 4: {
			System.out.println("Divistion:" +(a/b));
			break;
		}
		default: {
			System.out.println("Invalid Chooice");
		}
		}
		sc.close();
	}

}
