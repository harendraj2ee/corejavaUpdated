package com.json.gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.sampled.Line;

import com.harendra.model.CommonPojo;
public class ListMethodTest {
	public static void main(String[] args) {
		CommonPojo cp = new CommonPojo();
		System.out.println(cp.getAddress());
		listMetod();
		m();
	}
	public static ArrayList listMetod(){
		ArrayList<CommonPojo> list = new ArrayList<CommonPojo>();
		CommonPojo cp=new CommonPojo();
		
		list.add(cp);		
		String id=cp.getId();
		cp.setId(id);
		String address=cp.getAddress();
		cp.setAddress(address);
		String name=cp.getName();
		cp.setName(name);
		String desig=cp.getDesignation();
		cp.setDesignation(desig);
		String mobile=cp.getMobileNo();
		cp.setMobileNo(mobile);
		String compName=cp.getCompanyName();
		cp.setCompanyName(compName);
		double ctc=cp.getCtc();
		System.out.println(" "+compName +" "+name);
		
		return list;
		
	}
	public static void m(){
		String test = "Do this at \"2014-09-16 05:40:00.0\"";
		String part[]=test.split("\"");
		String part1= part[0];
		String part2= part[1];
		System.out.println(part1 +":::: "+part2);
		
		for(String s:part){
			System.out.println("s >>> "+s +" :: sss  >> "+part[0]);
		}
		for(int i=0; i<part.length; i++){
			System.out.println("i  >> "+i+" part[i] :: "+part[i]);
		}String str = "Location \"Welcome  to india\" Bangalore " +
	            "Channai \"IT city\"  Mysore";
		List<String> list = new ArrayList<String>();
		Matcher m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(str);
		//Matcher m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(str);
		while(m.find()){
			list.add(m.group(1));
		}

		System.out.println("list >> "+list);
	}
	


}
