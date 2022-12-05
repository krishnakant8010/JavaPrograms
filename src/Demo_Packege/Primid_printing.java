package Demo_Packege;

import java.util.Scanner;

public class Primid_printing {
	public static void main(String a[]) {
	int i,j,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of row=");
	n=sc.nextInt();
	
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(j);
			
		}
		
		System.out.println();
}
	}
}