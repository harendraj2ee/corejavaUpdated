package com.interv2;

public class Emp {
	String name;
	int salary;
	static String company;
	public void details() {
		System.out.println("Name :: "+name);
		System.out.println("Salary :: "+salary);
		System.out.println("Company :: "+company);
	}

	public static void main(String[] args) {
		Emp.company="HCL";
		Emp e = new Emp();
		e.name="Jimmy Pandit";
		e.salary=150000;
		
		Emp e2 = new Emp();
		e2.name="Chirag";
		e2.salary=50000;
		
		e.details();
		e2.details();
		
		Emp.company="Google";
		e.name="Sivraj";
		e.salary=48889;
		
		e.details();
		
	}

}
