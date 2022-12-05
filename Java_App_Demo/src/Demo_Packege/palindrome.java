package Demo_Packege;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,z,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		n=sc.nextInt();
		z=n;
		while(n>0) {
		 rev=(rev*10)+n%10;
		 n=n/10;
		}if(rev==z) {
			System.out.println("This is Palindrome Number");
		}else {
			System.out.println("This is not Palindrome Number");
		}
	sc.close();
	}

}
