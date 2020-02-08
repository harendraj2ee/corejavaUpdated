package com.javainteviewpoint.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtility {

    //Method to serialize and save the object in the file
	public void serialize(Object obj, String filePath) {
    	try {
			FileOutputStream fileOutputStream = new FileOutputStream(filePath);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(obj);
			objectOutputStream.flush();
			objectOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
   
	//Method to deserialize and return the object
	public Object deSerialize(String filePath) {
		Object obj = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(filePath);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			obj = objectInputStream.readObject();
			System.out.println("obj >>> "+obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	public static void main(String[] args) {
		//Path to store the Serialized object
		String filePath ="D://JavaWrite//java-interviewQA.txt"; 
		Employee emp = new Employee(1, "Harendra Kumar Sah MCA HMRITM DELHI...");
		SerializationUtility su = new SerializationUtility();
        //Serialize emp object
		su.serialize(emp, filePath);
		
		Employee empDesr = (Employee) su.deSerialize(filePath);
		System.out.println("Employee Id >> "+empDesr.getEmpId());
		System.out.println("Employee Name >> "+empDesr.getEmpName());
		
		System.out.println("suuuuu >> "+su.toString());
	}

}
