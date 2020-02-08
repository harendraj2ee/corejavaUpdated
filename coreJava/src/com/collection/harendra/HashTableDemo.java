package com.collection.harendra;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class HashTableDemo {
	public static void main(String[] args) throws IOException {
		hashTable();
		propertiesFile();
	}
	//Hashtable defaulf value 11 
	public static void hashTable(){
		Hashtable h = new Hashtable();
		h.put(new Temp2(5), "A");
		h.put(new Temp2(2), "B");
		h.put(new Temp2(6), "C");
		h.put(new Temp2(15), "D");
		h.put(new Temp2(23), "E");
		h.put(new Temp2(16), "F");
		//h.put("durga", null);
		System.out.println("Hashtable h default is 11 >>> "+h);

		// default capacity initilised by bucket value is 25 by user
		Hashtable h2 = new Hashtable(25);
		h2.put(new Temp2(5), "A");
		h2.put(new Temp2(2), "B");
		h2.put(new Temp2(6), "C");
		h2.put(new Temp2(15), "D");
		h2.put(new Temp2(23), "E");
		h2.put(new Temp2(16), "F");
		//h.put("durga", null);
		System.out.println("Hashtable h2 initilised by bucket value is 25 by user 11 >>> "+h2);

		//Customised bucket is 9 by user else
		Hashtable h1 = new Hashtable();
		h1.put(new Temp3(5), "A");
		h1.put(new Temp3(2), "B");
		h1.put(new Temp3(6), "C");
		h1.put(new Temp3(15), "D");
		h1.put(new Temp3(23), "E");
		h1.put(new Temp3(16), "F");
		//h.put("durga", null);
		System.out.println("Hashtable h1 Customised bucket is 9 then result >>> "+h1);		
	}
	//Propeties class
	public static void propertiesFile() throws IOException{
		Properties p = new Properties();
		//D:\FILES\EclipseIDE\NeonIDE\WorkSpace_Neon\DurgaSoft\src\abc.properties
		FileInputStream fis = new FileInputStream("D://FILES//EclipseIDE//NeonIDE//WorkSpace_Neon//DurgaSoft//src//abc.properties");
		p.load(fis);
		System.out.println("properties >> "+p);
		String s = p.getProperty("Harendra");
		System.out.println("s >>> "+s);
		p.setProperty("username", "harendraj2ee");
		p.setProperty("password", "abcde@");
		FileOutputStream fos = new FileOutputStream("D://FILES//EclipseIDE//NeonIDE//WorkSpace_Neon//DurgaSoft//src//abc.properties");
		p.store(fos, "Updated by Harendra for DurgaSof");
		
	}
}

class Temp2{
	int i;
	 public Temp2(int i) {
		this.i = i;
	}
	 public int hashCode(){
		 return i;
	 }
	 public String toString(){
		 return i+"";
	 }
}
//Customised hashtable value 9
class Temp3{
	int i;
	 public Temp3(int i) {
		this.i = i;
	}
	 public int hashCode(){
		 return i%9;
	 }
	 public String toString(){
		 return i+"";
	 }
}

