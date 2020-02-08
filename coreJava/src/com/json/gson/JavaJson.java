//package com.json.gson;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.text.ParseException;
//import java.util.Iterator;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
//public class JavaJson {
//	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
//		writeJson();
//		readJson();
//	}
//	private static void writeJson(){
//		JSONObject jsonObject = new  JSONObject();
//		jsonObject.put("website", "smls.codes.com");
//		jsonObject.put("Year", new Integer(2016));
//		System.out.println("jsonObject >> "+jsonObject);
//		JSONArray jsonArray = new JSONArray();
//		jsonArray.add("Java");
//		jsonArray.add("JavaScript");
//		jsonArray.add("Servers");
//		jsonArray.add("Tools");
//		jsonArray.add("Devops");
//		jsonObject.put("articls", jsonArray);
//		System.out.println("articls >> "+jsonArray);
//		try {
//			FileWriter fw = new FileWriter("D://Small Codes//data.json");
//			fw.write(jsonObject.toString());
//			fw.flush();
//			fw.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("json after catch >>  "+jsonObject);
//	}
//	private static void readJson() throws ParseException, FileNotFoundException, IOException{
//		
//		//1.Create JSONParser object, parse the json file and store values into Object type
//       try{ JSONParser parser = new JSONParser();
//        Object obj = parser.parse(new FileReader("D://Small Codes//data.json"));
//        
//        
//        //2.Convert Object type values into JSONObject type values
//        JSONObject jsonObject = (JSONObject) obj;
//        System.out.println("jsonObject >> "+jsonObject);
//        
//        //3.use  get(�key�) method to get values
//        String website = (String) jsonObject.get("website");
//        System.out.println("website :   "+website);
//        Long yr = (Long) jsonObject.get("Year");
//        System.out.println("Year    :   "+yr);
//        
//        JSONArray array = (JSONArray) jsonObject.get("articls");
//        System.out.println("arrayarray +array"+array);
//        Iterator<String> iterator = array.iterator();
//        System.out.println("iterator >> "+iterator);
//      
//        
//        int i=0;
//        while (iterator.hasNext()) {
//            i++;
//            System.out.println("article["+i+"]    :  "+iterator.next());
//        }
//
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//
//        
//	}
//}
