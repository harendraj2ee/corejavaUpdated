package com.tech.mentro;
//How to work with Understaing Finalize Method
class A2
{
	static int counter;
	int no;
	public A2()
	{
		no=++counter;
		System.out.println("Object "+no+ " of A is created.");
	}
	protected void finalize()
	{
		counter--;
		System.out.println("Object "+no+ " of A is being Destroyed.");
	}
}
class CreatorAndDestroyer
{
	public static void main(String arr[])throws Exception
	{
		System.out.println("Creating Some object of A.");
		
		
		Apple3 x=new Apple3();
		new Apple3();
		Apple3 y=new Apple3();
		new Apple3();
		new Apple3();
		System.out.println("Creating the execution of the Garbage Collector(GC).......");
		System.out.println("Requesting the execution of the Garbage Collector......");
		System.gc();
		System.out.println("Suspending the execution of main so that GC can be executed...");
		Thread.sleep(1000);
		System.out.println("Execution of main resumed, "+A2.counter+ " Objects of A are left.");
	}
}