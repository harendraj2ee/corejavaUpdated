package com.oops.interview.suritya;

public class Employee {
	String name,address,mobile;
	int sal,age;
	
	void setEmpData() {
		name="Upendra";
		address="Delhi";
		mobile="8750665823";
		sal=25000;
		age=30;
	}
	void showEmpData() {
		System.out.println(name +" "+address+" "+mobile+ " "+sal+" "+age );
	}
	
	void setData(String n,String a,String m,int s,int ag) {
		name=n;
		address=a;
		mobile=m;
		sal=s;
		age=ag;
	}
	
	public static void main(String[] args) {
		System.out.println("Default Createing Same type of Employee method...");
		Employee emp1 = new Employee();
		emp1.setEmpData();
		emp1.showEmpData();
		
		System.out.println("Customization Different method param type..");
		Employee emp2 =new Employee();
		emp2.setData("Prakash", "Noida", "9868762002", 35000, 35);
		emp2.showEmpData();

	}
}
