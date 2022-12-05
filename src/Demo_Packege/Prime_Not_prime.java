package Demo_Packege;

import java.util.Scanner;

public class Prime_Not_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=1,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		while(i<=n) {
			if(n/i==0)
			count=count+1;
			i++;
		}if(count==2) {
			System.out.println("This is not prime: " +n);
		}else {
			System.out.println("This is prime: " +n);
		}
		sc.close();
	}

}
