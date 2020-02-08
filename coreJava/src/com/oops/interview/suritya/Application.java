package com.oops.interview.suritya;

public class Application {
	//final synchronized public  static strictfp   void main(String ...ar) {
	public static void main(String args[]) {
		System.out.println("check mmmeeee");
		show();
		getClassMethod();
		Opertator();
		
	}
	static void Opertator() {
		byte b =10;
		//b = b+1; // b=(type of b)(b+1)
		b = (byte)(b+1);
		b++;  //// b=(byte)(b+1)
		
		System.out.println("byte b >>> "+b);
		
		byte b1 = 10;
		byte b2 = 10;
		byte b3 = (byte) (b1+b2);  //formula  max(int, type of b1, type of b2) // max(int, byte,byte)
		System.out.println("byte b3 add >> "+b3);
		
		byte b4 = 100;
		byte b5 = 100;  //-128 to 127 (-128 0 127 ) (200-127+0=72)  (-128+72=56)
		byte b6 = (byte) (b4+b5);  //formula  max(int, type of b1, type of b2) // max(int, byte,byte)
		System.out.println("byte b3 add >> "+b6);
	}
	static void getClassMethod() {
		Application aap = new Application();
		Class c = aap.getClass();
		System.out.println("GetClass Name >> "+c.getName());
		System.out.println("GetClass Class clas Name >> " +aap.getClass().getName());
	}
	
	static void show() {
		System.out.println("show Method...");
		int x =10;
		System.out.println("x is premitive dAta type >> "+x);
		Integer i = new Integer(x);  // Boxing 
		Integer i2 =x;  // AutoBoxing  //1.5 jdk in
		System.out.println("AutoBoxing >> "+i2);

		System.out.println("Boxing Data types >> "+i);
		int p =i.intValue();  //UnBoxing
		int p2 =i;  //AutoUnBoxing
		System.out.println("AutoUnBoxing >> "+p2);

		System.out.println("Unboxing >> "+p);
	}

}
