package com.serilization;
import java.io.*;
class Emp implements Serializable
{
	private String name;
	private String job;
	private int salary;
	//private transient int salary; //Make data member as transient so that should not serilize to it.
	public Emp(String n,String j,int s)
	{
		name=n;
		job=j;
		salary=s;
	}
	public void display()
	{
		System.out.println(name+" "+job+" "+salary );
	}
} 