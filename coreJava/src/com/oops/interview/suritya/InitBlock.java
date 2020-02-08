package com.oops.interview.suritya;
public class InitBlock {
	{
		System.out.println("InitBlock 1...");
	}
	int x; 
	 InitBlock() {
		System.out.println("Init Block 2..    ");
		x=10;
		System.out.println(x);
	}
	 InitBlock(int x){
		 System.out.println("Default Constructor...");
	 }
	 InitBlock(int x,int y){
		 System.out.println(x);
		 System.out.println(y);
	 }
	 {
		 System.out.println("Init Block 3....");
	 }
	 InitBlock(int x,int y,int z){
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
	 }
	 {
		 x=20;
		 System.out.println(x);
		 System.out.println("Init Block 4 .... ");
	 }
	public static void main(String args[]) {
		InitBlock ib = new InitBlock();
		System.out.println("Default constructor-------------------------------------0");
		new InitBlock(23);
		System.out.println("one param Constructor-----------------------------------1");
		new InitBlock(25, 70);
		System.out.println("two param Consructor------------------------------------2");

		new InitBlock(10, 30, 40);
		System.out.println("three param Constructor---------------------------------3");
	}
	{
		System.out.println("Init Block 5.... ");
	}
}
