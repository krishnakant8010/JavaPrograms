package Demo_Packege;

import java.util.Scanner;

public class Pirmid_printing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,b,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows=");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			for(b=1;b<=n-i;b++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(i+j);
			System.out.println();
		}

	}

}
