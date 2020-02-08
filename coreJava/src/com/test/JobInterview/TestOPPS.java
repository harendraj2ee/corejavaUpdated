package com.test.JobInterview;

class Oops1{
	protected void m1() {
		System.out.println("Oops1 m1()..");
	}
}
class Opos2 extends Oops1{
	public void m1() {
		System.out.println("Oops2 m1()..");
	}
}

public class TestOPPS {

	public static void main(String[] args) {
		Oops1 oops1 = new Oops1();
		Opos2 opos2 = new Opos2();
		oops1.m1();
		opos2.m1();
			
	}

}
