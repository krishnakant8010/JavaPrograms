package Java_opps;

import java.util.Scanner;

public class add_number {

	int a,b,sum;
	
	void get_data() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number=");
		a=sc.nextInt();
		System.out.println("Enter second Number=");
		b=sc.nextInt();
		
	}
	void Addtion(){
		sum=a+b;
		System.out.println("Addition=" +sum);
	}
	}
