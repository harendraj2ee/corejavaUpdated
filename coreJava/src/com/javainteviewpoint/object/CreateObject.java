package com.javainteviewpoint.object;

public class CreateObject {
	String value=null;
	public CreateObject(String value) {
		this.value=value;
	}
	public void disp() {
		System.out.println("welcome value >> "+value);
	}
	
	public static void main(String args[]) {
		CreateObject co = new CreateObject("JavaInterviewPoint");
		co.disp();
	}

}
