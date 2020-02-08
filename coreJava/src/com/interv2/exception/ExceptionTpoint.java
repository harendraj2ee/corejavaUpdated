package com.interv2.exception;

import java.io.IOException;

public class ExceptionTpoint {
	public static void main(String[] args) {
		Excetion1.excetiontest1();
		MultpleExcetion.multpleExcp();
		// MultpleExcetionReverse.multpleExcpRev();
		NextedException.nextedExce();
		FinallyBlockTest.finallyBlock();
		// FinallyException.finallyExcOcc();
		FinallyExcept.finalllyExcOc();
		ThrowExctionCustom.throwCustomeEx(18);
		PropgateExcepton.p();
		PropgateThrowException.p();
	}
}

//1. Excepation
class Excetion1 {
	public static void excetiontest1() {
		try {
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code..");
	}
}

//2. multiple catch Exception 
class MultpleExcetion {
	public static void multpleExcp() {
		try {
			int arr[] = new int[5];
			arr[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Task1 is completed..");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Task2 is completed..");
		} catch (Exception e) {
			System.out.println("Common Task is completedd...");
		}
		System.out.println("Rest of Mutiple Exception is...");
	}
}

//2. multiple catch Exception Reverse
//class MultpleExcetionReverse{
//	public static void multpleExcpRev() {
//		try {
//			int arr[] = new int[5];
//			arr[5]=30/0;
//		} catch (Exception e) {System.out.println("Common Task is completed....");}
//		catch (ArithmeticException e) {System.out.println("Task1 is completed..");}
//		catch (ArrayIndexOutOfBoundsException e) {System.out.println("Task2 is completed.."); }
//		System.out.println("Rest of Mutiple Exception is...");
//	}
//}
class NextedException {
	public static void nextedExce() {
		try {
			try {
				System.out.println("Goging to Divide...");
				int b = 30 / 0;
			} catch (ArithmeticException e) {
				System.out.println("inner eXceptin >> " + e);
			}
			try {
				int arr[] = new int[5];
				arr[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOut Inner >> " + e);
			}
			System.out.println("Other statement.....");
		} catch (Exception e) {
			System.out.println("Handled.... ");
		}
		System.out.println("Normal flow");
	}
}

class FinallyBlockTest {
	public static void finallyBlock() {
		try {
			int data = 25 / 5;
			System.out.println("data >> " + data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally Block is always executed..");
		}
		System.out.println("Rest of the After Finally....");
	}
}

class FinallyException {
	public static void finallyExcOcc() {
		try {
			int data = 25 / 0;
			System.out.println("data2 >> " + data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally Block is always executed case 2..");
		}
		System.out.println("Rest of the code case2.....");
	}
}

class FinallyExcept {
	public static void finalllyExcOc() {
		try {
			int b = 25 / 0;
			System.out.println("b data >> " + b);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally Block is always executed.. FinallyException2......");
		}
		System.out.println("Rest of the Code FinallyExcetion2.... ");
	}
}

class ThrowExctionCustom {
	public static void throwCustomeEx(int age) {
		// int age=18;
		if (age < 18)
			throw new ArithmeticException("Not Valid");
		else
			System.out.println("You are welcome to vote Valid..");
	}
}

class PropgateExcepton {
	static void m() {
		int data = 50 / 0;
	}

	static void n() {
		m();
	}

	static void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception handeld....");
		}
	}
}

class PropgateThrowException {
	static void m() throws IOException {
		throw new java.io.IOException("Device Error");
	}

	static void n() throws IOException {
		m();
	}

	static void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Catch Exception Handled....");
		}
	}
}