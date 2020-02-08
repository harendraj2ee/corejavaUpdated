package com.loosecouple.interview;
/*class Shape{
	void draw() {
		System.out.println("Drawing a Shape..");
	}
}*/
abstract class Shape1{
	public Shape1() {
		System.out.println("Drawing a Shape.. is Constructed.. through Constructor");
	}
	abstract void draw(); //no definition
}
class Circle1 extends Shape1 { // Object to Object Inheritance
	void draw() {//overriding
		System.out.println("Drawing a Circle..");
	}
}
class Rectangle1 extends Shape1{
	void draw() {
		System.out.println("Drawing a Rectangle..");
	}
}
class Polygon1 extends Shape1{
	void draw() {
		System.out.println("Drawing a Polygon..");
	}
}
public class OOPsConceptAbstract {
	public static void main(String[] args) {
		/*Shape s;
		s = new Shape();
		s.draw();
		Circle c;
		c = new Circle();
		c.draw();*/
		
		//RunTime Polymorphishm
		Shape1 s;
		s = new Circle1(); // Polymorphism statement.
		s.draw();
		s = new Rectangle1();
		s.draw();
		s = new Polygon1();
		s.draw();
		//s = new Shape1();
		//s.draw();
	}

}
