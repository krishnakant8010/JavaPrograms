package Java_opps;

import java.util.Scanner;

public class Constructors_add {
	int a, b;
	
	Constructors_add(){
		a=2;
		b=3;
	}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number=");
		a=sc.nextInt();
		System.out.println("Enter second number=");
		b=sc.nextInt();
	}
	
	void display() {
		System.out.println("First Number=" +a + "\n" + "Second Number=" +b);
	}
	
	void ouput() {
		int add;
		add=a+b;
		System.out.print("Sum=" +add);
	}
	public static void main(String a[]) {
		Constructors_add aa=new Constructors_add();
		aa.display();
		aa.input();
		aa.display();
		aa.ouput();	
	}
}
