package com.interv2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NEC { // origional main - 1
	static int x = 50;

	public static void main(String[] args) {
		// static int x=4; we can't declare static inside a method
		System.out.println("main method ");
		main();
		NEC nec = new NEC();
		nec.x = 55;
		nec.x = 66;
		System.out.println("value is nec.x=66 ::: " + x);
		// for(;;); //indefinite loop

		NECInterface necInterface = new NECImplment();
		necInterface.nec();
		necInterface.nec2();
		NECDemo.necDemo();

	}

	public static void main() {
		System.out.println("It is main method is overlodad ");
	}

}

class NECDemo {
	protected static void necDemo() {
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Vikas");
		list.add("Ram");
		System.out.println("List dublicate value :: " + list);
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		System.out.println("Set Dublicate vlaue are not allow :: " + set);
	}
}

class NECDemo2 extends NECDemo {
	protected void necDemo2() {

	}
}

class NECImplment implements NECInterface {
	@Override
	public void nec() {
		System.out.println("NECImplment nec() ");
	}

	@Override
	public void nec2() {
		System.out.println("NECImplment nec2() ");
	}
}

//final immutable class - 2

final class Company {
	public static void main(String args[]) {
		Company c = new Company();
		c.setCompId(1);
		System.out.println("compId :: " + c.getCompId());
		NecEmp n = new NecEmp();
		n.setAddress("Rampur");
		n.setName("Sheetal");
		n.setId(20);
		System.out.println("id:" + n.getId() + ",name:" + n.getName() + ",Address:" + n.getAddress());

	}

	private int compId;

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}
}

class NecEmp {
	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

//Main 3
class NECOverridingMain { // Polymorphism
	public static void main(String args[]) {
		NECOverrinding necOverriding = null;
		necOverriding = new NECOverrinding();
		necOverriding.necPoly();
		necOverriding = new NECOverrinding2();
		necOverriding.necPoly();
	}
}

class NECOverrinding {
	public void necPoly() {
		System.out.println("NECPolymorphism");
	}
}

class NECOverrinding2 extends NECOverrinding {
	public void necPoly() {
		System.out.println("NECPolymorphism2");
	}
}

//main - 4
class NECOverloadMain {
	public static void main(String args[]) {
//		NECOverload necOverload =null;
//		necOverload = new NECOverload();
//		necOverload.m(20.44);
		NECOverload2 necOverload2 = new NECOverload2();
		necOverload2.m(445);
		necOverload2.m(3.87);
		necOverload2.m(10, "Saroj", 'H');
	}
}

class NECOverload {
	public void m(double a) {
		a = 3.07;
		System.out.println("double value of a " + a);
	}
}

class NECOverload2 extends NECOverload {
	public void m(int a, String name, char ch) {
		a = 50;
		System.out.println("int value of a : " + a);
		System.out.println("name : " + name);
		System.out.println("character : " + ch);

	}
}

//Main - 5
class OverloadCustomMain {
	public static void main(String args[]) {
		OverloadCustmReturn olcr = new OverloadCustmReturn();
		olcr.customRetrunType();
		OverloadCustmReturn2 olcr2 = new OverloadCustmReturn2();
		olcr2.customRetrunType();

	}
}

class OverloadCustmReturn {
	public short customRetrunType() {
		System.out.println("OverloadCustmReturn Number Return");
		return 1;
	}
}

class OverloadCustmReturn2 extends OverloadCustmReturn {
	public short customRetrunType() {
		System.out.println("OverloadCustmReturn2 Integer Return");

		String s = "Harendra";
		System.out.println(s.hashCode());
		s = "Harendra";
		System.out.println(s.concat("harendddd") + "vvv");
		System.out.println(s.hashCode());
		// String s1
		System.out.println(s);
		String s4 = new String("ABDC") + "vivek" + "Raj" + 'h';
		String s5 = "BDDD".concat(s4);
		System.out.println("s4 cont : " + s4);
		System.out.println("s5 Cont :: " + s5);
		return '5';
	}
}

//main - 6
class Avizva {
	static int x = 5;
	static int y = x + 2;

	public static void main(String args[]) {
		int Runnable = 5;
		Double Double = 55.4;
		String String = "Jitu";
		// int int =5; /does not take primitive type as a variable reference & object
		// type can take
		System.out.println("Runnable :" + Runnable + ", String as Variable :" + Double + " , " + String);
		String s = new String("hks");
		String s2 = new String("hks");
		if (s == s2) {
			System.out.println("jh");
		} else {
			System.out.println("jjjj");
		}

		Avizva obj = new Avizva();
		System.out.println("x : " + obj.x + " y : " + obj.y);
	}
}

//main -7
class Avizva2 {
	public static void main(String arrgs[]) {
		int a = 7;
		int c = 6;
		int b = 0;
		b = 7 == 6 ? a : c;
		System.out.println("b :" + b + ",  a :" + a);
		double d = 10.0;
		double d1 = 15;
		System.out.println(d);
		System.out.println("d1 :" + d1);
		for (;;)
			; // infinity loop after 1058you can't declare and not used any variable or
				// message,etc
	}
}

// main -8
class AvizvaException {
	public static void main(String args[]) {
		try {
			System.out.println("5.0/0 is :" + 5.0 / 0); // Infinity
			System.out.println("0/5 is :" + 0 / 5); // output is 0
			System.out.println("5/0 is :" + 5 / 0); // dirclty call Arithmeic Exception then call finally

			System.out.println("Ater divide msg...");

		} catch (ArithmeticException e) {
			System.out.println("Arithemetic Exception block");
		} finally {
			System.out.println("finally block..");
		}
	}
}

// main -9
class AvizvaMainNestedClass {
	public static void main(String args[]) {
		AvizvaClass.avizvaClass();
		AvizvaClass.AvizvaNested.avizvaNested();
		AvizvaClass.AvizvaNested.AvizvaNestedClass.avizvaNestedClass();
	}
}

class AvizvaClass {
	int instance = 20;
	String String = "Sanjay Babu";

	public static void avizvaClass() {
		System.out.println("avizvaClass() outer Class");
	}

	static class AvizvaNested {
		String str = "AvizvaNested";

		public static void avizvaNested() {
			System.out.println("avizvaNested() inner class");
		}

		static class AvizvaNestedClass {
			String Address = "AvizvaNestedClass";

			public static void avizvaNestedClass() {
				System.out.println("avizvaNestedClass() nested class");
			}
		}
	}
}

//KelltonTech main - 10

class KelltonTechMainException {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		try {
			/// System.exit(4); exit for jvm
			System.out.println("before Exception");
			System.out.println("Exceptin :: " + 5 / 0);
			System.out.println("after Exception");

		} catch (ArithmeticException e) {
			System.out.println("HarryArithmeticExceptionHMRITM ::>>> " + e);
			System.out.println("HarryArithmeticHMRITMException ::>>> " + e);
			System.out.println("HarryHMRITMArithmeticException ::>>> " + e);
			// return;
		} catch (Exception e) {
			System.out.println("Exceitopn :: " + e);
		} finally {
			System.out.println("finally block.");
		}

		System.out.println("After finally block 1");
		System.out.println("After finally block 2");

		if (true) {
			System.out.println("true msg");
		} else {
			System.out.println("false msg");
		}
	}
}

//main -11  Interface create Object NECInterface
class InterfaceClass {
	public static void main(String args[]) {
		NECInterface necInterface = new NECInterface() {

			@Override
			public void nec2() {
				System.out.println("Hello ji nec2()");
			}

			@Override
			public void nec() {
				System.out.println("Hi ji nec()");
			}
		};
		necInterface.nec();
		necInterface.nec2();

		String s = "hello";
		s.substring(0, 2);
		System.out.println(s.concat("Java"));
		String s2 = s.substring(0, 2);
		System.out.println(s2.concat("Hero"));
	}
}

//main-12 Overloading
class MainOverloading {
	public static void main(String args[]) {
		System.out.println(sum(2) + "," + sum(1, 2) + "," + sum(2.5, 2) + "," + sum(3.2, 3.2) + "," + sum(4.5, 4) + ","
				+ sum(5, 6.5) + "," + sum(6, 7.2) + "," + sum(8, 9) + "," + sum(5.3, 8.5, 7.6) + ","
				+ sum(3.44, 12.6, 15.7) + "," + sum(10, 15, 20));
		System.out.println(sum("Harendra", "Sah") + ", " + sum('A', 'd'));
	}

	private static double sum(int a) {
		return a;
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return (a + b + c);
	}

	private static float sum(float a, int b) {
		return a + b;
	}

	private static float sum(int a, float b) {
		return a + b;
	}

	private static float sum(float a, float b) {
		return (a + b);
	}

	private static double sum(double a, double b) {
		return (a + b);
	}

	private static double sum(int a, double b) {
		return a + b;
	}

	private static double sum(double a, int b, double c) {
		return a + b + c;
	}

	private static int sum(double a, double b, double c) {
		return (int) (a + b + c);
	}

	private static String sum(String fname, String lname) {
		return fname + " " + lname;
	}

	static int sum(char a, char b) {
		return a + b;
	}
}

//Main 13  Overriding
class MainOverriding {
	public static void main(String args[]) {
		Overriding2 over = new Overriding2();
		System.out.println(over.override(5, 8) + " & " + over.override("Harendra ", 7));
		Overriding ov = new Overriding();
		System.out.println(ov.override("4", 5));
	}
}

class Overriding {
	public static String override(String a, int b) {
		return a + b;
	}
}

class Overriding2 extends Overriding {
	public static int override(int a, int b) {
		return (a + b);
	}
}

// Main 14

//Java program to illustrate the 
//concept of Abstraction 

class Test1 {
	public static void main(String[] args) {
		Shape s1 = new Circle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}

abstract class Shape {
	String color;

	abstract double area(); // these are abstract methods

	public abstract String toString();

	public Shape(String color) { // abstract class can have constructor
		System.out.println("Shape constructor called");
		this.color = color;
	}

	public String getColor() { // this is a concrete method
		return color;
	}
}

class Circle extends Shape {
	double radius;

	public Circle(String color, double radius) {
		super(color); // calling Shape constructor
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.color + "and area is : " + area();
	}
}

class Rectangle extends Shape {
	double length, width;

	public Rectangle(String color, double length, double width) {
		super(color); // calling Shape constructor
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + super.color + "and area is : " + area();
	}
}

class DefaultConstructor {
	int id;
	String name;

	void display() {
		System.out.println("id : " + id + ",  name : " + name);
	}

	public static void main(String args[]) {
		DefaultConstructor dc = new DefaultConstructor();
		DefaultConstructor dc1 = new DefaultConstructor();
		dc.display();
		dc1.display();

	}
}

class TrickyInterviewQA {
	public static void main(String args[]) {
		System.out.println('A' + 'a');
		System.out.println(10 + 20 + "Javatpoint");
		System.out.println("Javatpoint" + 10 + 20);
		System.out.println("Javatpoint" + (10 + 20));
		System.out.println(10 * 20 + "Javatpoint");
		System.out.println("Javatpoint" + 10 * 20);
		System.out.println("javatpoint" + 50 / 10);
		final int a;
		a = 10;
		// x=5;
		System.out.println("value: " + a);
		for (int i = 0; i <= 0; i++) {
			System.out.println("dddd");
		}
	}
}

class Factorial {
	static int fact = 1;

	public static void main(String args[]) {
		for (int i = 1; i <= 5; i++) {
			fact = (fact) * i;
		}
		System.out.println(fact);
	}
}

class MainInheritance {
	public static void main(String args[]) {
		Dog d = new Dog();
	}
}

class Animal {
	public Animal() {
		System.out.println("Animal is created.");
	}
}

class Dog extends Animal {
	public Dog() {
		System.out.println("Dog is created..");
	}
}

class Ad {
	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5, 6, 1, 4, 2, 2, 7, 25, 25 };

		int Sum = 100;

		for (int i = 0; i < myArray.length; i++) {

			for (int j = 1; j < myArray.length; j++) {
				if (myArray[j - 1] + myArray[j] == Sum) {
					System.out.println("{0}, {1}" + myArray[j - 1] + "," + myArray[j]);
				}
			}
		}
		System.out.println();
	}
}

class Hey {
	public static void main(String[] args) {
		int A[] = { 6, 8, 7, 5, 3, 11, 10 };

		int sum = 12;
		int[] B = new int[A.length];
		int Max = A.length;

		for (int i = 0; i < A.length; i++) {
			B[i] = sum - A[i];
			if (B[i] > Max)
				Max = B[i];
			if (A[i] > Max)
				Max = A[i];

			System.out.print(" " + B[i] + "");

		} // O(n) here;

		System.out.println("\n Max = " + Max);

		int[] Array = new int[Max + 1];
		for (int i = 0; i < B.length; i++) {
			Array[B[i]] = B[i];
		} // O(n) here;

		for (int i = 0; i < A.length; i++) {
			if (Array[A[i]] >= 0)
				System.out.println("We got one: " + A[i] + " and " + (sum - A[i]));
		} // O(n) here;

	}
}

//Bellurbis  Programm
class Bellurbis {
	static int i = 0;

	public static void main(String args[]) {
		if (i <= 100) {
			System.out.println("Table is : " + i++);
			main(null);
		}

	}
}

//Finoit Noida
class Finoit {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (ch == '0') {
				count0++;
				System.out.println("Zero is Nos of times : " + count0);
			}
			if (ch == '1') {
				count1++;
				System.out.println("One is Nos of times : " + count1);
			}
			if (ch == '2') {
				count2++;
				System.out.println("Two is Nos of times : " + count2);
			}
			if (ch == '3') {

				count3++;
				System.out.println("Three is Nos of times : " + count3);
			}
			if (ch == '4') {
				count4++;
				System.out.println("Four is Nos of times : " + count4);
			}
			if (ch == '5') {
				count5++;
				System.out.println("Five is Nos of times : " + count5);
			}
			if (ch == '6') {
				count6++;
				System.out.println("Six is Nos of times : " + count6);
			}
			if (ch == '7') {
				count7++;
				System.out.println("Seven is Nos of tiems : " + count7);
			}
			if (ch == '8') {
				count8++;
				System.out.println("Eight is Nos of times : " + count8);
			}
			if (ch == '9') {
				count9++;
				System.out.println("Nine is Nos of times : " + count9);
			} else {
				System.out.println("Condition is not statisfied....:) ");
			}

		}
	}
}

class Mainnn {
	public static void main(String args[]) {
		boolean bool = true;
		if (bool == false)
			System.out.println("check meeee");
		// return ;
		// System.out.println("hellll");
		else if (true)
			System.out.println("jjjjj");
		else
			System.out.println("iiiii");
	}
}

class Break {
	public static void main(String args[]) {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("----------------------");
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}
	}
}

class InfiniteLoop {
	public static void main(String args[]) {
		for (;;)
			System.out.println("Welcome to Edureka!");
	}
}

class ByteTest {
	public static void main(String args[]) {
		byte b = 10;
		byte b1 = 20;
		short s = 4;
		short s1 = 5;
		byte b2 = (byte) (b + b1);
		short s2 = (short) (s + s1);
		System.out.println("b2 : " + b2 + "  s2 : " + s2);
		System.out.println("b+b1 :" + b + b1 + ",  s+s1 :" + s + s1);

		String str = new String("word");
		System.out.println(20 + 30 + " Hellow " + 20 + 30);

	}
}

class Base {
	void method(int a) {
		System.out.println("Base class method called with integer a = " + a);
	}

	void method(double d) {
		System.out.println("Base class method called with double d =" + d);
	}
}

class Derived extends Base {
	@Override
	void method(double d) {
		System.out.println("Derived class method called with double d =" + d);
	}
}

 class BaseMain {
	public static void main(String[] args) {
		new Derived().method(10.3);
		new Derived().method(15);
	}
}
 
 class MainFinal {  
	 public static void main(String args[]){  
	   final int i;  
	   i = 20;  
	   System.out.println(i);  
	 }  
	}  