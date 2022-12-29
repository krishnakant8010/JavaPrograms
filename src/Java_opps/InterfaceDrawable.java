package Java_opps;

interface InterfaceDrawable {
	void draw();
}

//Implementation: by second user
class Rectangle1 implements InterfaceDrawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle implements InterfaceDrawable {
	public void draw() {
		System.out.println("drawing circle");
	}
}