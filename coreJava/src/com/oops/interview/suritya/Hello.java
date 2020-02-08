package com.oops.interview.suritya;
public class Hello {
	public static void main(String args[]) {
		System.out.println("Hello..");
		D.main();
	}
}
class A{
	public static void main(String args[]) {
		System.out.println("A..");
		B.main(args);
	}
}
class B{
	public static void main(String args[]) {
		System.out.println("B..");
	}
}
class C{
	public static void main(String args[]) {
		System.out.println("C..");
	}
}
class D{
	public static void main(String ... args) {
		System.out.println("D..");
	}
}