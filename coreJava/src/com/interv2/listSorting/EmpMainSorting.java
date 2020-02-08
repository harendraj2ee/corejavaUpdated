package com.interv2.listSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpMainSorting {

	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Vikas", "Yadav", 36);
		Emp e2 = new Emp(5, "Dinesh", "Gupta", 45);
		Emp e3 = new Emp(2, "Rahul", "Sharma", 21);
		Emp e4 = new Emp(3, "Vivek", "Roy", 55);
		Emp e5 = new Emp(4, "Sanjay", "Singh", 23);
		
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		System.out.println("empList :: "+empList); //UnSorted List
		Collections.sort(empList);
		System.out.println("Default Sorting Employee : "+empList);	//Default sorting by employee id
	}
}

class MainCompartorSorting{
	public static void main(String args[]) {
		Emp e1 = new Emp(1, "Vikas", "Yadav", 36);
		Emp e2 = new Emp(5, "Dinesh", "Gupta", 45);
		Emp e3 = new Emp(2, "Rahul", "Sharma", 21);
		Emp e4 = new Emp(3, "Vivek", "Roy", 55);
		Emp e5 = new Emp(4, "Sanjay", "Singh", 23);
		
		
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		System.out.println("empList : "+empList);  //Unsorted list
		Collections.sort(empList);
		
		System.out.println("Default Sorting : "+empList); //Default Sorting
		
		Collections.sort(empList, new FnameSorter()); //Sorted by Fname
		System.out.println("Sorted By Fname : "+empList);
		
		Collections.sort(empList, new LnameSorter());
		System.out.println("Sorted By Lname : "+empList); //Sorted by Lname
		
		Collections.sort(empList, new AgeSorter()); //Sorted by Age
		System.out.println("Sorted By Age : "+empList);
		
		
		
	}
}
