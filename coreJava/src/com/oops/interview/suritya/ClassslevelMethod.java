package com.oops.interview.suritya;

public class ClassslevelMethod {
	int num1,num2,sum;
	 ClassslevelMethod add(int a,int b) {
		num1=a;
		num2=b;
		sum =num1+num2;
		//return new ConstructorTest();
		return this;
	}
	 void add1(ClassslevelMethod consTest) {
		 int x=consTest.num1;
		 int y=consTest.num2;
		 System.out.println("Sum is >> "+(x+y));
	 }
	public static void main(String[] args) {
		ClassslevelMethod obj = new ClassslevelMethod();
		ClassslevelMethod total=obj.add(50, 10);
		System.out.println(obj.sum);
		System.out.println("total sum is >> "+total.sum);
		obj.add1(total);
	}

}
