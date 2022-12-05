package Java_opps;

import java.util.Scanner;

public class Argument_passing {

	int n;
	void get_data(int i){
		n=i;
	}
	void put_data() {
		int rev=0;
		while(n>0) {
			rev=(rev*10)+n%10;
			n=n/10;
		}
		System.out.println("Reverse=" + rev);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		Argument_passing aa=new Argument_passing();
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter Number=");
		m=sc.nextInt();
		aa.get_data(m);
		aa.put_data();
		sc.close();
	}
	

}
