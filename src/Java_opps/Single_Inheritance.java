package Java_opps;

import java.util.Scanner;

 class Single_Inheritance extends add_number{

	int c;
	void second_getdata() {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Number for sub=");
		c=sc2.nextInt();
		
	}
	void displayed_sub() {
		System.out.println("sub of Total number of ADD=" + (a+b-c));
	}
	
 }
 

