package com.javainteviewpoint.object;
public class WithoutLoopPrintTable {

	public static void  withoutLoop(int n) {
		if(n<10) {
			withoutLoop(n+1);
		}
		System.out.print(n +" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withoutLoop(1);
		//WithoutLoopPrintTable outLoop = new WithoutLoopPrintTable();
		//outLoop.withoutLoop(1);
	}

}
