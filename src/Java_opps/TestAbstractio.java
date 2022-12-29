package Java_opps;

abstract class TestAbstractio {
	abstract void draw();
}

//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends TestAbstractio {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Rectangle {
	void draw() {
		System.out.println("drawing circle");
	}
}
