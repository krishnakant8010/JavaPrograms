package Java_opps;

import java.util.Scanner;

 class First_add {

	int a,b;
	void input() {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter First Number=");
		a=Sc.nextInt();
		System.out.println("Enter Second Number");
		b=Sc.nextInt();
		
	}
	void add() {
		System.out.println("Addtion first two=" + (a+b));
	}
 }
  class Second_add extends First_add{
	int c;
	void getdata() {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Number=");
		c=sc2.nextInt();
		
	}
	void displayed() {
		System.out.println("Total number of Addtion=" + (a+b+c));
	}
 }
 
class Single_Inheritance{ 

	public static void main(String a[]) {
	
	Second_add aa=new Second_add();
	
	aa.input();
	aa.getdata();
	aa.add();
	aa.displayed();
	
}
}
