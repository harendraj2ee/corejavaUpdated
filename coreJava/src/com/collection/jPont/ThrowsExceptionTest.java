package com.collection.jPont;

import java.io.IOException;

public class ThrowsExceptionTest {
	public static void main(String[] args) throws IOException {
		ThrowExcetion.p();
		try {
			ThrowExceptionM.m();
		} catch (Exception e) {
			System.out.println("Exception Handled 2.....");
		}
		System.out.println("Normal flow 2....  ");

		FinalVariable.finalVari();
		FinallyDemo.finallyBlock();
		FinalizeClass.finalizeMethod();
	}
}

class ThrowExcetion {
	static void m() throws IOException {
		throw new IOException("Device error");
	}

	static void n() throws IOException {
		m();
	}

	static void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception Handled....");
		}
		System.out.println("Normal Flow.....");
	}
}

class ThrowExceptionM {
	static void m() throws IOException {
		throw new IOException("Device error 2...");
	}
}

class FinalVariable {
	static void finalVari() {
		final int i = 10;
		// i=100; //if changes value showing error.
		System.out.println("i value >> " + i);
	}
}

class FinallyDemo {
	static void finallyBlock() {
		try {
			int x = 100;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally Block is executed...s");
		}
	}
}

class FinalizeClass {
	static void finalizeMethod() {
		FinalizeClass f1 = new FinalizeClass();
		FinalizeClass f2 = new FinalizeClass();
		f1 = null;
		f2 = null;
		System.out.println("f1 finalize mehod >> " + f1);
		System.gc();
		System.out.println("After System.gc() method >> " + f1);
	}
}