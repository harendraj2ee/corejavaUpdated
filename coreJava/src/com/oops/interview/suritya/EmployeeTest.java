package com.oops.interview.suritya;
import java.util.Scanner;
public class EmployeeTest {
	String name,cmpName,mobile;
	int age,sal;
	int k=11;
	//k=4; //compile time exception
	public static void main(String[] args) {
		EmployeeTest empTest = new EmployeeTest();
		System.out.println("emptTest >> "+empTest);
		empTest.name="Ram";
		empTest.cmpName="GlobalLogic";
		empTest.mobile="+919968444679";
		empTest.age=35;
		empTest.sal=55000;
		empTest.showEmpInfo();
		
		EmployeeTest empTest1 = new EmployeeTest();
		empTest1.showEmpInfo();
		empTest1.name="Surya Tripathi";
		empTest1.cmpName="RapidSoft";
		empTest1.mobile="9868762002";
		empTest1.age=30;
		empTest1.sal=40000;
		empTest1.showEmpInfo();
		
		EmployeeTest empTest2;
		empTest2 = new EmployeeTest();
		empTest2.showEmpInfo();
		empTest2=empTest1;
		System.out.println("empTest1 >> "+empTest1);
		System.out.println("empTest2 >> "+empTest2);
		empTest2.name="Vishnu";
		empTest1.showEmpInfo();
		
		EmployeeTest empTest3 = new EmployeeTest();
		System.out.println("empTest3 >> "+empTest3);
		int i =empTest3.hashCode();
		System.out.println("hascode of empTest3 >> "+i);
		String hexa = Integer.toHexString(i);
		System.out.println("HexaDecimal Value >> "+hexa);
		System.out.println("empTest3 "+empTest3.getClass().getName()+'@'+hexa);
		
		
		empTest.add();
		System.out.println(empTest);// no show data because of void method.
		empTest.subtract();
		int subt=empTest.subtract();
		System.out.println(subt+1);
		System.out.println("Subtract is subt >> "+subt+1);
		
		empTest.add(45, 15);
		int subParam=empTest.subtract(45, 25);
		System.out.println("Subtract Param >> "+subParam);
		
		//empTest.add(Integer.parseInt(args[0]),Integer.parseInt(args[1])); //String command Line Argument Value pass at cmd
		empTest.sum();
		int num1=0, num2=0;
		empTest.sum( num1, num2);
		
	}
	@Override
	 public String toString() {
	        return getClass().getName() + "$" + Integer.toHexString(hashCode());
			//return "Harendra"; // custome toString() method
	    }
	 void showEmpInfo() {
		System.out.println(name+" "+cmpName+" "+mobile+" "+age+" "+sal);
	}
	 void doWrok() {
		 System.out.println("Employee Now Working..");
	 }
	 void charting() {
		 System.out.println("Employee are now Charting.. ");
	 }
	 void add() {
		 int x=10;
		 int y=20;
		 int z=x+y;
		 System.out.println("Add >> "+z);
	 }
	 int subtract() {
		 int x=70;
		 int y=20;
		 int sub=x-y;
		 //System.out.println("Subtract Method >> "+sub);
		 return sub;
	 }
	 void add(int x,int y) {
		 int z=x+y;
		 System.out.println("Add param >> "+z);
	 }
	 int subtract(int x,int y) {
		 int sub=x-y;
		 //System.out.println("Subtract Method >> "+sub);
		 return sub;
	 }
	 void sum() {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter 1st number :- ");
		 int a=input.nextInt();
		 System.out.println("Enter 2nd number :- ");
		 int b=input.nextInt();
		 int sum=a+b;
		 System.out.println("use input sum >> "+sum);
	 }
	 void sum(int num1,int num2) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter 1st number param :- ");
		 num1=input.nextInt();
		 System.out.println("Enter 2nd number param :- ");
		 num2=input.nextInt();
		 int sum=num1+num2;
		 System.out.println("use input sum param >> "+sum);
	 }
}
