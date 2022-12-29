package Java_opps;


public class Java_Demo_program {

	public static void main(String[] args) {

//		int m;
//		Scanner sc=new Scanner(System.in);
//			System.out.println("\n"+ "Add the your given two nunber");
//			add_number aa=new add_number();
//			aa.get_data();
//			aa.Addition();
//			
//			System.out.println("\n"+ "---------Check Prime_number or not-----------");
//			Prime_number primedata=new Prime_number();
//			primedata.prime_data();
//			primedata.prime_results();
//			
//			System.out.println("\n"+ "---------Argument_passing for Reverse-----------");
//			Argument_passing ArgPass=new Argument_passing();
//			System.out.println("Enter Number=");
//			m=sc.nextInt();
//			ArgPass.get_data(m);
//			ArgPass.put_data();
//		
//			System.out.println("\n"+ "-------------Default Constructors------------");
//			Constructors_add constructors_test=new Constructors_add();
//			constructors_test.display();
//			constructors_test.input();
//			constructors_test.display();
//			constructors_test.ouput();
//			
//			System.out.println("\n"+"------------- 	Parameterized Constructor------------");
//			Parameterized_Constructor paracong=new 	Parameterized_Constructor(3,5);
//			Parameterized_Constructor paracong1=new 	Parameterized_Constructor(12,5);
//			paracong.Out_put();
//			paracong1.Out_put();
//			
//			System.out.println("\n"+"------------- 	Static Data members------------");
//			Static_Data_members  datamember= new Static_Data_members(101,"Krishna kant");
//			Static_Data_members  datamember1= new Static_Data_members(102,"Ajit Kumar");
//			datamember.display();
//			datamember1.display();
//			
//			System.out.println("\n"+"------------- 	Static member function------------");
//			Static_member_function SM_Function= new Static_member_function(101,"Krishna kant");
//			SM_Function.Display();
//			Static_member_function.change();
//			SM_Function.Display();
//			
//			System.out.println("\n"+ "------------- 	Array Example------------");
//			Array_Example array1=new Array_Example();
//			array1.get_data();
//			array1.displayed();

//			System.out.println("\n"+ "------------- Single_Inheritance------------");
//			Single_Inheritance SIn=new Single_Inheritance();
//			SIn.second_getdata();
//			SIn.get_data();
//			SIn.Addtion();
//			SIn.displayed_sub();

//			System.out.println("\n"+ "------------- First_Multilevel_Inheritance------------");
//
//			First_Multilevel_Inheritance mlt_level=new First_Multilevel_Inheritance();
//			mlt_level.get_data();
//			
//			mlt_level.Addtion();
//			mlt_level.second_getdata();
//			mlt_level.displayed_sub();
//			mlt_level.multiple();
//			
//
//		System.out.println("\n" + "------------- Method_Overriding------------");
//		Method_Overriding_child over_riding = new Method_Overriding_child();
//		over_riding.car();
//		over_riding.bike();
//
//		System.out.println("\n" + "------------- String_example------------");
//		String_example details = new String_example();
//		details.get_data();
//		details.displayed();
		
//		System.out.println("---------------String_methord-----------------");
//		String_methord_test methords=new String_methord_test();
//		methords.get_data();
//		methords.get_len();
//		methords.get_postion();

//		System.out.println("-----------------Constructor Overloading-----------");
//		ConstructorOverloading s1 = new ConstructorOverloading (111,"Karan");  
//		ConstructorOverloading s2 = new ConstructorOverloading(222,"Aryan",25);  
//	    s1.display();  
//	    s2.display();
//	    
//	    System.out.println("-----------------Copy Constructor-----------");
//	    CopyConstructor cc = new CopyConstructor(111,"Karan");  
//	    CopyConstructor cc1 = new CopyConstructor(cc);  
//	    s1.display();  
//	    s2.display(); 
	    
//		System.out.println("-------------example of Abstract class----------------------");
//	    Circle1 as=new Circle1();
//	    as.draw();
//	    
//	    Rectangle ra=new Rectangle();
//	    ra.draw();
//	    
//	    
//	    TestBank b;  
//	    b=new SBI();  
//	    System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
//	    b=new PNB();  
//	    System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
//	    
//	    System.out.println("-------------Interface Example------------------");
//	    InterfaceDrawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
//	    d.draw();
	    
	    
	    Bank bbb=new SBI1();  
	    System.out.println("ROI: "+bbb.rateOfInterest()); 
	    
	    System.out.println("---------------Multiple inheritance in Java----------");
	    A7 obj = new A7();  
	    obj.print();  
	    obj.show(); 
	}

}
