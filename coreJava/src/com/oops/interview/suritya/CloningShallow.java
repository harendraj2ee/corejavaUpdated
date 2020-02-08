package com.oops.interview.suritya;
class A9{
	int x;
	public A9(int p) {
		x=p;
	}
}
class B9 implements Cloneable{
	int y;
	A9 a;
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	 B9(int q,A9 a1 ) {
		y=q;
		a=a1;
	}
}
public class CloningShallow {
	public static void main(String[] args) throws CloneNotSupportedException {
		A9 a = new A9(10);
		B9  b = new B9(20, a);
		System.out.println(b.y+"  "+b.a.x);
		B9 b1 = (B9) b.clone();
		
		b1.y=100;
		b.a.x=200;
		System.out.println(b1.y+"  "+b1.a.x);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b.y+"  "+b.a.x);


	}
}
