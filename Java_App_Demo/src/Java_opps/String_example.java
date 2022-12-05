package Java_opps;

import java.util.Scanner;

public class String_example {
	String name=new String();
	String add=new String();
	void get_data() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name=");
		name=sc.nextLine();
		System.out.println("Enter Your Address=");
		add=sc.nextLine();
	}
	void displayed() {
		System.out.println("Name=" + name + "\n" +"Address=" +add);
	}
	
	public static void main(String args[]) {
		String_example aa=new String_example();
		aa.get_data();
		aa.displayed();
	}
}
