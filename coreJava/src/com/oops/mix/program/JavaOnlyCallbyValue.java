package com.oops.mix.program;
public class JavaOnlyCallbyValue {
	int data=50;
	void change(int data) {
		data=this.data;
		data=data+100;
	}

	public static void main(String[] args) {
		JavaOnlyCallbyValue obj = new JavaOnlyCallbyValue();
		System.out.println("Before Changes Values >> "+obj.data);
		obj.change(5000);
		System.out.println("After Changes values >> "+obj.data);
		
	}

}
