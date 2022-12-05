package Demo_Packege;

import java.util.Scanner;

public class pactorial_of_any_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,z,fect=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		z=n;
		while (n>0) {
			fect=fect*n;
			n=n-1;
		}
		System.out.println("factorial no of " + z + "=" +fect);
		sc.close();
	}

}
