package com.array.basic;
class Parent{
	public void parentMethod() {
		System.out.println("check ParentMethod...");
	}
}
class Child extends Parent{
	public void childMethod() {
		System.out.println("Check ChildMethod .... ");
	}
}
public class ParentClass {
	public static void main(String args[]) {
		//case - 1
//		Parent p = new Parent();
//		p.parentMethod();
//		p.childMethod(); //showing error
		//case - 2
		Child c = new Child();
		c.parentMethod();
		c.childMethod();
	
		//case - 3
//		Parent p = new Child();
//		p.parentMethod();
//		p.childMethod();//showing error
		
		//case - 4
//		p.childMethod(); //show error..
		
		//case - 4
	//	Child c = new Parent();//showing error.
//		c.childMethod();
	}

}
