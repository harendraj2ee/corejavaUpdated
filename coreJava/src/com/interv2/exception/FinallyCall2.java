package com.interv2.exception;

public class FinallyCall2 {
	public static void main(String[] args) {
		try {
			badMethod();
			System.out.print("A");
		} catch (Exception ex) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public static void badMethod() {
		throw new Error(); /* Line 22 */
	}
}

//C is printed before exiting with an error message