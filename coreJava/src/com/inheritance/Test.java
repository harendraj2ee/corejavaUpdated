package com.inheritance;

class Parent {
	int j = 9;

	void pare(int i) {
		System.out.println("Parents::" + this.j);
	}
}

class child extends Parent {
	int j = 90;

	void pare(int i) {
		System.out.println("child:::" + super.j);
	}
}

public class Test {

	@Override
	public int hashCode() {
		System.out.println("ooooo");
		return 0;
	}

	@Override
	public boolean equals(Object ob) {
		boolean flag = false;
		System.out.println("on Equals method");
		return flag;

	}

	public static void main(String args[]) {

		int[] ad = { 1, 2 };
		System.out.println("Hi" + ad.length);
		for (int y = 0; y < ad.length; y++) {
			System.out.println(ad[y]);

		}
		String str = "vivek";
		System.out.println("str::" + str.hashCode());
		str = str.concat("rajput");
		System.out.println("str2::" + str.hashCode());

		str.equals(str);

		for (int h : ad) {
			System.out.println("count::" + h);
		}
		Parent p = new child();
		System.out.println("hascode:::" + p.toString());
		System.out.println("hascode:::" + p.hashCode());
		System.out.println(p.getClass());
		/*
		 * child c = (child) new Parent(); c.pare(8);
		 */
		p.pare(6);
		System.out.println(p.j);

		/*
		 * int x=0; if(x>=0); if(x>=0) System.out.println("ll");
		 * System.out.println("llllllll");
		 */

	}
}
