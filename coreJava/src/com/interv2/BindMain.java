package com.interv2;
class BindMain{
	public static void main(String args[]) {
		Bind bind1=new Bind();
		Bind bind2 = new Bind();
		bind2.bind("Jeo Bhai");
		Bind.invoke(bind1);
	}
}
class Bind{
	public void bind() {
		System.out.println("In Bind bind()..");
	}
	public void bind(String args) {
		System.out.println("Welcome Binding Test Program...");
	}
	public static void invoke(Bind bind) {
		bind.bind();
	}
}

