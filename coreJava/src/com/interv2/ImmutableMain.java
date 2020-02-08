package com.interv2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ImmutableMain {
	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass(2, "Jitendra");
		System.out.println("id : "+ic.getId() +" , "+" name : "+ic.getName());
		// Uncommenting below line causes error 
        // ic.id = 102; 
	}
}

final class ImmutableClass{
	 final int id;
	 final String name;
	public ImmutableClass(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}
//Serilizable and DeSerilizable Demo
class SerializationPojo implements Serializable{
	
	private static final long serialVersionUID = 7145762837317299389L;
	public int a;
	public String b;
	
	public SerializationPojo(int a, String b) {
		this.a=a;
		this.b=b;
	}
}

class SerializationMain{
	public static void main(String args[]) {
		SerializationPojo objPojo = new SerializationPojo(2, "Harendra Kumar Sah");
		String filename="file.ser";
		//Serialization
		try {
			//Saving of object in a file 
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// Method for serialization of object
			oos.writeObject(objPojo);
			oos.close();
			fos.close();
			System.out.println("Object has been serialized.");
			
		}catch (IOException e) {
			System.out.println("IOException is caught");
		}
		
		SerializationPojo objPojo1 = null;
		//DeSerialization
		try {
			//Reading the object from a file
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			// Method for deserialization of object
			objPojo1 = (SerializationPojo) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Object has been deserialized "); 
            System.out.println("a = " + objPojo1.a); 
            System.out.println("b = " + objPojo1.b); 
		}
		
		catch (IOException e) {
			System.out.println("IOException is caught.");
		}catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException is caught.");
		}
	}
}
 class  FinalList{
	public static void main(String arg[]) {
		final List<Integer> list=new ArrayList<Integer>();
		list.add(8);
		list.add(99);
		System.out.println(list);
	}
}
 final class FinalTest{
	 String name;
	
	 public static void main(String args[]) {
		 FinalTest ft =new FinalTest();
		 ft.name="Harendra";
		 ft.name="Jitesh";
		 System.out.println(ft.name);
		
	 }
 }
 class StaticClassMain{
	 public static void main(String args[]) {
		 StaticClass1.method();
		 
	 }
 }
 class StaticClass{
	 public static void method() {
		 System.out.println("Static method...");
	 }
 }
 class StaticClass1 extends StaticClass{
	 public static void method() {
		 System.out.println("StaticClass1 extend method");
	 }
 }
 
 
 