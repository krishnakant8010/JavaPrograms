package Java_opps;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

class A7 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

}
