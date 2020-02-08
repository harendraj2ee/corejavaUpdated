package com.harendra.mocktest;
public class MockTest {
	public static void s() {
		int j = 5;
		  for (int i = 0; i< j; i++)
		  {
		    if ( i <= j-- )
		       System.out.print(  (i*j)  + " ");
		  }
	}
	public static void main(String args[]) {
		s();
	}

}
