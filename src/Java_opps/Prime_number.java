package Java_opps;

import java.util.Scanner;
 class Prime_number {
	int n;
	void prime_data() {
		Scanner prime_value=new Scanner(System.in);
		System.out.println("Enter for check prime number or not=");
		n=prime_value.nextInt();
		
	}
	//int b=n;
	void prime_results() {
		int  count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count=count+1;
		}
		
		if(count==2)
			System.out.println("This number is prime=" +n);
		else
			System.out.print("This number is not prime=" +n);
	}
}
