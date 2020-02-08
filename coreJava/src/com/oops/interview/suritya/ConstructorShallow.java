package com.oops.interview.suritya;
public class ConstructorShallow {
	String name;
	int age;
	ConstructorShallow(String n,int a){
		name=n;
		age=a;
	}
//	ConstructorShallow(ConstructorShallow s2){
//		System.out.println(s2);
//		name=s2.name;
//		age=s2.age;
//	}
	ConstructorShallow(){
		
	}
	void show() {
		System.out.println(name+"  "+age);
	}
	public static void main(String[] args) {
		ConstructorShallow s =new ConstructorShallow("Suriya", 35);
		s.show(); 
//		ConstructorShallow s1=new ConstructorShallow(s);
//		s1.name=s.name;
//		s1.age=s.age;
		ConstructorShallow s1 =new ConstructorShallow();
		s1=s;
		s1.show();
		System.out.println(s+"  "+s1);
	}

}
