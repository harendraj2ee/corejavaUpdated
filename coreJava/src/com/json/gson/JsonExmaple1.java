//package com.json.gson;
//
//import org.json.simple.JSONObject;
//
//public class JsonExmaple1 {
//	public static void main(String args[]){
//		JSONObject jsonObject=new JSONObject();
//		jsonObject.put("Name", "Harendra");
//		jsonObject.put("Address", "SitaPuri");
//		jsonObject.put("mobileNo", "9968444679");
//		System.out.println("jsonObject >>> "+jsonObject);
//		JSONObject jsonObject2=new JSONObject();
//		jsonObject2.put("Course", "M.tech");
//		jsonObject2.put("state", "Delhi");
//		System.out.println("jsonObject2 >> "+jsonObject2);
//		
//		
//		JSONObject jsonObject3=new JSONObject();
//		jsonObject3.put(jsonObject, jsonObject2);
//		System.out.println("jsonObject3  :: "+jsonObject3);
//		
//		jsonObject3.put(jsonObject, jsonObject);
//		System.out.println("jsonObject :: "+jsonObject);
//		jsonObject3.put("jsonObject", jsonObject);
//		jsonObject3.put("jsonObject2", jsonObject2);
//		System.out.println(jsonObject3);
//	}
//}