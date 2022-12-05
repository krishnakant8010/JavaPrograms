package Java_opps;

import java.util.Scanner;

public class Array_Example {
	int a[]=new int[10];
	
		
		void get_data() {
		int i = 0;
		
		
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<10;i++) {
			System.out.print("Enter Nubmer=");
			a[i]=sc.nextInt();
		}
		}
		
		void displayed() {
			int i;
		
		for(i=0;i<10;i++)
		System.out.print(a[i] + ",");
		//System.out.print(",");
	}
	
public static void main(String args[] ){
	Array_Example aa=new Array_Example();
	aa.get_data();
	aa.displayed();
	
}
}
