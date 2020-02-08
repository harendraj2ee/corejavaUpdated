package com.harendra.mocktest;

public class OOPSmockTest {
	int x =10;
	static int count=100;
	static int x2=100;
	 int y=200;
	public void increment() {
		count++;
	}
	public void assign(int x) {
		x=x;
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		//---------------1--------
		new OOPSmockTest().assign(100);
		//---------------2---------
		OOPSmockTest ck =  new OOPSmockTest();
		ck.increment();
		OOPSmockTest ck2 = new OOPSmockTest();
		System.out.println(ck2.count);
		//---------------3----------
		 int z;
		//z=x2+y; eroor....
		//System.out.println("z >> "+z);
		
	}

}
