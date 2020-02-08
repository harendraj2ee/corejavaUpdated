package com.oops.interview.suritya;
public class ConstructorDeep {
	String name;
	int age;
	ConstructorDeep(String n,int a){
		name=n;
		age=a;
	}
	ConstructorDeep(){
		
	}
	void show() {
		System.out.println(name+"  "+age);
	}
	public static void main(String[] args) {
		ConstructorDeep s =new ConstructorDeep("Suriya", 35);
		s.show(); 
		ConstructorDeep s1=new ConstructorDeep();
		s1.name=s.name;
		s1.age=s.age;
		s1.show();
		
		System.out.println(s+"  "+s1);
	}

}
