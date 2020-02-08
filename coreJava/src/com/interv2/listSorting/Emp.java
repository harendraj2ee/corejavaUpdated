package com.interv2.listSorting;

public class Emp implements Comparable<Emp>{
	private int id;
	private String fname;
	private String lname;
	private int age;
	public Emp(int id, String fname, String lname, int age) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
	
	

}
