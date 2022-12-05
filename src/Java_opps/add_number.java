package Java_opps;

import java.util.Scanner;

public class add_number {

	int a,b,sum;
	
	void get_data() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first data=");
		a=sc.nextInt();
		System.out.println("Enter second data=");
		b=sc.nextInt();
		
	}
	void Put_data(){
		sum=a+b;
		System.out.println("Addition=" +sum);
	}
	}
