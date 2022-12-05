package Demo_Packege;

import java.util.Scanner;

public class Array_of_pultiply {
	
	public static void main(String args[]) {
		int i,prod=1,size;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of array=");
		size=sc.nextInt();
		int a[]=new int[size];
		
		for(i=0;i<size;i++) {
			System.out.println("Enter Number=");
			a[i]=sc.nextInt();
			
		}
		for(i=0;i<size;i++) {
			prod=prod*a[i];
		}
		System.out.println("Prod=" +prod);
		
		
	}
	
}
