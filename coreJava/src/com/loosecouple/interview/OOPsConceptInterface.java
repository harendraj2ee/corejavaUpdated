package com.loosecouple.interview;
/*class Shape{
	void draw() {
		System.out.println("Drawing a Shape..");
	}
}*/
/*abstract class Shape1{
	public Shape1() {
		System.out.println("Drawing a Shape.. is Constructed.. through Constructor");
	}
	abstract void draw(); //no definition
}*/
interface Shape2{
	void draw();
}
class Circle2 implements Shape2 { // Not Object to Object Inheritance
	public void draw() {//overriding
		System.out.println("Drawing a Circle..");
	}
}
class Rectangle2 implements Shape2{
	public void draw() {
		System.out.println("Drawing a Rectangle..");
	}
}
class Polygon2 implements Shape2{
	public void draw() {
		System.out.println("Drawing a Polygon..");
	}
}
public class OOPsConceptInterface {
	public static void main(String[] args) {
		/*Shape s;
		s = new Shape();
		s.draw();
		Circle c;
		c = new Circle();
		c.draw();*/
		
		//RunTime Polymorphishm
		Shape2 s;
		s = new Circle2(); // Polymorphism statement.
		s.draw();
		s = new Rectangle2();
		s.draw();
		s = new Polygon2();
		s.draw();
		//s = new Shape2();
		//s.draw();
	}

}
