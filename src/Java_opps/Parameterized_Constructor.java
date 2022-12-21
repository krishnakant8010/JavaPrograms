package Java_opps;

public class Parameterized_Constructor {
	int a, b;
	Parameterized_Constructor(int x, int y){
		a=x;
		b=y;
	}
	void Out_put() {
		int add;
		add=a+b;
		System.out.println("\n" +"Sum first and second number =" +add);
	}
}
