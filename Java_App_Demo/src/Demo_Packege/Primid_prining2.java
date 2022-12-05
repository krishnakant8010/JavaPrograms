package Demo_Packege;

import java.util.Scanner;

public class Primid_prining2 {
	public static void main(String a[]) {
		int i,b,n,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows=");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			for(b=1;b<i;b++)
				System.out.print(" ");
			for(j=1;j<=n+1-i;j++)
				System.out.print(j);
			System.out.println();
			
			
		}
		
		
	}

}
