package com.oops.polymorphisms;
class DataMember{
	int data=50;
	void m() {
		System.out.println("DataMember its mean parent class..");
	}
}
class ChildData extends DataMember{
	int data=80;
	 void m() {
		 System.out.println("ChildData its a Child Class.. ");
	}
}

public class DirectInstanceDataMember {
	public static void main(String[] args) {
		DataMember dm = new ChildData();
		int a=dm.data;
		System.out.println(a);
		dm.m();
	}
}
