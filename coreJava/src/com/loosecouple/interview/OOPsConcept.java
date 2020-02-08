package com.loosecouple.interview;
class Shape{
	void draw() {
		System.out.println("Drawing a Shape..");
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("Drawing a Circle..");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing a Rectangle..");
	}
}
class Polygon extends Shape{
	void draw() {
		System.out.println("Drawing a Polygon..");
	}
}
public class OOPsConcept {
	public static void main(String[] args) {
		/*Shape s;
		s = new Shape();
		s.draw();
		Circle c;
		c = new Circle();
		c.draw();*/
		
		//RunTime Polymorphishm
		Shape s;
		s = new Circle(); // Polymorphism statement.
		s.draw();
		s = new Rectangle();
		s.draw();
		s = new Polygon();
		s.draw();
		s = new Shape();
		s.draw();
	}

}
