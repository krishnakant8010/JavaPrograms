package Demo_Packege;

import java.util.Scanner;

public class product_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,prod=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter Any Number");
		n=sc.nextInt();
		while(n>0) {
			prod=prod*(n%10);
			n=n/10;
		}
	System.out.print("Product of digit: "+prod);
		sc.close();

	}

}
