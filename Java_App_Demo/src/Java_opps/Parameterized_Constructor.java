package Java_opps;

import java.util.Scanner;

public class Parameterized_Constructor {
	int a, b;
	Parameterized_Constructor(int x, int y){
		a=x;
		b=y;
	}
	void Out_put() {
		int add;
		add=a+b;
		System.out.println("Sub=" +add);
	}
	public static void main(String a[]) {
		int n, m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number=");
		n=sc.nextInt();
		
		System.out.println("Enter Second Nunber=");
		m=sc.nextInt();
		
		Parameterized_Constructor aa=new Parameterized_Constructor(n,m);
		aa.Out_put();
		sc.close();
		
		
	}
}
