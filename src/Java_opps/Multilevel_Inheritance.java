package Java_opps;


class First_Multilevel_Inheritance extends Single_Inheritance{
	int mlt;
	void multiple() {
		mlt=a*b*c;
		System.out.println("Multification:=" +mlt);
	}
	
//	int a;
//	void input() {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Number=");
//	a=sc.nextInt();
//	
//	}
//}
//class Second_Multilevel_Inheritance extends First_Multilevel_Inheritance{
//	int b;
//	void getdata_value() {
//	Scanner second_value=new Scanner(System.in);
//	System.out.println("Enter Number=");
//	b=second_value.nextInt();
//	second_value.close();
//	}
//}
//class Third_Multilevel_Inheritance extends Second_Multilevel_Inheritance {
//	//int a;
//	void add() {
//		System.out.println("Add=" + (a+b));
//	}
//}
//public class Multilevel_Inheritance {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Third_Multilevel_Inheritance aa=new Third_Multilevel_Inheritance();
//		aa.input();
//		aa.getdata_value();
//		aa.add();
//	}
//
}
