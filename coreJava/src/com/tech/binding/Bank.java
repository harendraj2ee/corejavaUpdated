package com.tech.binding;
abstract class Account 
{
	private String name;
	private double balance;
	public Account(String n,double b)
	{
		name=n;
		balance=b;
	}
	//method to obtain interest rate of an account
	public abstract double getInterestRate();
	//method to display details of each Account in a standard format which can't be changed by any of its sub class
	public static final void display(Account a)
	{
		System.out.println("Name : "+a.name);
		System.out.println("Balance : "+a.balance);
		System.out.println("Type : "+a.getClass().getName());
		System.out.println("Interest Rate : "+a.getInterestRate());
		System.out.println("---------------------------------------");
	}
}
//sub classes of the Account
class Saving extends Account
{
	public Saving(String n,double b)
	{
		super(n,b);
	}
	public double getInterestRate()
	{
		return 4;
	}
}
class RD extends Account
{
	public RD(String n,double b)
	{
		super(n,b);
	}
	public double getInterestRate()
	{
		return 7;
	}
}
class Fixed extends Account
{
	public Fixed(String n, double b)
	{
		super(n,b);
	}
	public double getInterestRate()
	{
		return 9;
	}
}
//class to test Accounts
class Bank
{
	public static void main(String arr[])
	{
		System.out.println("Creating a Saving Account............");
		Account sa=new Saving("Raman",12000);
		System.out.println("Details of the Account. : ");
		Account.display(sa);
		
		System.out.println("Creating a RD Account ...............");
		Account ra=new RD("Aadity",20000);
		System.out.println("Details of Account. : ");
		Account.display(ra);
		
		System.out.println("Creting a Fixed Account..............");
		Account fa=new Fixed("Sachin",50000);
		System.out.println("Details of Account. : ");
		Account.display(fa);
	}
}