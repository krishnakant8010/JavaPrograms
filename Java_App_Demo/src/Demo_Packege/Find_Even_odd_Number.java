package Demo_Packege;

import java.util.Scanner;

public class Find_Even_odd_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr any number: ");
		i=sc.nextInt();
		
		if(i%2==0) {
			System.out.println("Thsi number is Even: " +i);
		}
		else {
			System.out.println("This number is Odd: " +i);
		}
		sc.close();
	}

}
