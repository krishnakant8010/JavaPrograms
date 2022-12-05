package Demo_Packege;

import java.util.Scanner;

public class Even_of_sum_odd_of_multiply_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, Sum=0,pro=1,degit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter any number");
		n=sc.nextInt();
		while(n>0) {
			degit=n%10;
			if (degit%2==0) 
				Sum=Sum+degit;
			else 
				pro=pro*degit;
				n=n/10;
			
		}
		System.out.println("Sum= " + Sum + " Pro= " +pro);
		sc.close();
	}

}
