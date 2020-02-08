
package com.a1.operator;

class Tank {
	int level;
}
class Value{
	int i;
}

public class Assignment {
	public static void main(String[] args) {
		mTank();
		System.out.println("===========================");
		m1Equals();
	}
	public static void mTank(){
		
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("1 :  t1.level: " + t1.level + " t2.level : " + t2.level);
		t1 = t2;
		System.out.println("2 :  t1.level: " + t1.level + " t2.level : " + t2.level);
		t1.level = 27;
		System.out.println("3 :  t1.level: " + t1.level + " t2.level : " + t2.level);
		
	}
	public static void m1Equals(){
		Value v1=new Value();
		Value v2=new Value();
		v1.i=100;
		System.out.println("v1.equals(v2) :: "+v1.equals(v2));
	}

}
