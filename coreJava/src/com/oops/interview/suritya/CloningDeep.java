package com.oops.interview.suritya;
class A10{
	int x;
	public A10(int p) {
		x=p;
	}
}
class B10 implements Cloneable{
	int y;
	A10 a;
	public Object clone() throws CloneNotSupportedException {
		A10 a1 =new A10(a.x);
		B10 b1 = new B10(y,a1);
		//return super.clone();
		return b1;
	}
	 B10(int q,A10 a1 ) {
		y=q;
		a=a1;
	}
}
public class CloningDeep {
	public static void main(String[] args) throws CloneNotSupportedException {
		A10 a = new A10(10);
		B10  b = new B10(20, a);
		System.out.println(b.y+"  "+b.a.x);
		B10 b1 = (B10) b.clone();
		
		b1.y=100;
		b.a.x=200;
		System.out.println(b1.y+"  "+b1.a.x);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b.y+"  "+b.a.x);


	}
}
