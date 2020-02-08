package com.interv2;

public class KelltonTech2 extends KelltonTech{
	public KelltonTech2(String s) {
		super(s);
		System.out.println("KeltonTech2 super(s)");
	}

	public void printMethod2(String s) {
		System.out.println("KelltonTech2 class printMethod()2 called. ");
	}
	public KelltonTech2() {
		System.out.println("KelltonTech2()");
	}

}
