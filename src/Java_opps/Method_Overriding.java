package Java_opps;

class first{
	void message() {
		System.out.println("Base class message");
	}
}

class second{
	void message() {
		System.out.println("Derived class message");
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second aa=new second();
		aa.message();
	}

}
