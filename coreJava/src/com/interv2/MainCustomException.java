package com.interv2;

import java.util.Scanner;

public class MainCustomException {
	private static Scanner input;

	public static void main(String args[]) {
		input = new Scanner(System.in);
		System.out.println("Enter the age in num : ");
		String s = input.nextLine();
		int age =Integer.parseInt(s);
		
		if(age>60) {
			throw new OldManException("You are the Older Person greter than age is 60.");
		}
		else if(age<18) {
			throw new YoungerManException("You are Not a younger person less then age is 18.");
		}
		else {
			System.out.println("Successfully Applied.");
		}
	}

}

//User Defined Exception or Coustom Exception
class YoungerManException extends RuntimeException{
	private static final long serialVersionUID = -7363623676122980563L;
	YoungerManException(String msg) {
		super(msg);
	}
}

class OldManException extends RuntimeException{
	private static final long serialVersionUID = -5280135061241609272L;
	public OldManException(String msg) {
		super(msg);
	}
}
class ArrayCheck{
	public static void main(String ags[]) {
		int a[]= {13,33,55,66,4,9,6,7};
		System.out.println(a[a[3]]);
	}
}

class DemoMain{
	public static void main(String args[]) {
		Demo d = new Demo();
		d.display();
		Demo1 d1 = new Demo1("JAVA MAN");
		d1.display1();
		Demo1 d2 = new Demo1(1, 3, 4);
	}
}
class Demo{
	int age=45;
	public Demo() {
		System.out.println("Demo() Constructor : "+age);
	}
	void display() {
		System.out.println("display() method.");
	}
}
class Demo1 extends Demo{
	public Demo1(String name) {
		System.out.println("name : "+name);
	}
	void display1() {
		System.out.println("Demo1 display1() ");
	}
	Demo1(int k, int j, int b){
		k=4; j=8; b=k+j;
		System.out.println("sum : "+b);
	}
}




























