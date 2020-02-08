package com.oops.interview.suritya;

public class EmployeInitMulti {
	String name;
	int age,id;
	Address addr;
	Salary sal;
	EmployeInitMulti(String n,int a,int i) {
		name=n;
		age=a;
		id=i;
	}
	{
		 addr = new Address();
	}
	{
		 sal = new Salary();
	}
	void showEmpInfo() {
		System.out.println(name+"  "+age+"  "+id);
		System.out.println(addr.city+"  "+addr.state+"  "+addr.country);
		System.out.println(sal.ta+"  "+sal.da+"  "+sal.hra);
	}
	public static void main(String[] args) {
		EmployeInitMulti emp = new EmployeInitMulti("Shiv",40,1234);
		emp.showEmpInfo();
	}
}
