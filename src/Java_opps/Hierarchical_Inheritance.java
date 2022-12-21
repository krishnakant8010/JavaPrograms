package Java_opps;

import java.util.Scanner;

class First_Hierarchical_Inheritance{
	int a,b;
	void input_data() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number=");
		a=sc.nextInt();
		System.out.println("Enter Second Number=");
		b=sc.nextInt();
		
	}
}
class Second_Hierarchical_Inheritance extends First_Hierarchical_Inheritance{
	void add_number() {
		System.out.println("Addtion=" + (a+b));
	}
}

class Third_Hierarchical_Inheritance extends First_Hierarchical_Inheritance{
	void subtarction() {
		System.out.println("Substraction=" + (a-b));
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second_Hierarchical_Inheritance aa=new Second_Hierarchical_Inheritance();
		Third_Hierarchical_Inheritance bb=new Third_Hierarchical_Inheritance();
		
		aa.input_data();
		aa.add_number();
		bb.input_data();
		bb.subtarction();
	}

}
