package Java_opps;

import java.util.Scanner;

public class Array_Example {
	int a[]=new int[2];
	
		void get_data() {
		int i = 0;
		for(i=0;i<2;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter element to insert into array");
			a[i] = sc.nextInt();
		}
		}
		
		void displayed() {
			int i;
		
		for(i=0;i<2;i++)
		System.out.print(a[i] + ",");
		//System.out.print(",");
	}
}
