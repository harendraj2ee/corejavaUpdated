package com.tech.mentro;
class Apple extends Object
{
	public Apple()
	{
		super(); //super(); Modification made by the compiler
		System.out.println("In Apple");
	}
}
class Ball extends Apple
{
	 Ball()	// B() Modification made by the compiler
	{
		super();
	}
}
class Cat extends Ball
{
	public Cat()
	{
		super();	//super(); Modification made by the compiler
		System.out.println("In C");
	}
}
class Apple3
{
	public static void main(String arr[])
	{
		Apple x=new Apple();
		Ball y=new Ball();
		Cat z=new Cat();
	}
}