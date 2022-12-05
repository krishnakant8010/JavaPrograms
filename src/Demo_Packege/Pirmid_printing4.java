package Demo_Packege;

import java.util.Scanner;

public class Pirmid_printing4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,b,j,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows=");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++) {
			for(b=1;b<i;b++)
				System.out.print(" ");
			for(j=1;j<=2*(n-i)-1;j++)
				System.out.print(j);
			System.out.println();
		}

	}

}
