package Demo_Packege;

import java.util.Scanner;

public class Primid_printing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,b,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr no of rows=");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++) {
			for(b=1;b<=n-i;b++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.print(j);
			System.out.println();
		}
		

	}

}
