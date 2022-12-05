package Demo_Packege;

import java.util.Scanner;

public class Array_of_Sum {
	
	public static void main(String agrs[]) {
		int i, size, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of array=");
		size=sc.nextInt();
		int a[]=new int[size];
		
		for(i=0;i<size;i++) {
			System.out.println("Enter number=");
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++) {
			sum=sum+a[i];
		}
		
		System.out.println("Sum=" +sum);
	}

}
