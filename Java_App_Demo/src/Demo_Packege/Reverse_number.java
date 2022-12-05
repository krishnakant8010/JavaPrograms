package Demo_Packege;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		n=sc.nextInt();
		
		while (n>0) {
			rev=(rev*10)+n%10;
			n=n/10;
		}
		System.out.println(rev);
		sc.close();
	}

}
