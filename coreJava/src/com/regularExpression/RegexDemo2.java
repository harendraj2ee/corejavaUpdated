package com.regularExpression;


import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
	static int count=0;
	private static CharSequence[] args;
	public static void main(String[] args){
		regex1();  //if ab or matches
		regex2();// if a or b or c matches
		regex3PredefindChar(); // if predefined character like //s or //S /. etc
		regex4Quantifier();  // Quantifier like a,a+,a*, a?
		regex5Split();  
		regex6Split();
		regex7Split();
		stringTokenizer1();
		stringTokenizer2();
	}
	public static void regex1(){
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abbaaabbab");
		while(m.find()){
			count++;
			System.out.println("start is : "+m.start()+", end is : "+m.end()+", group is : "+m.group());
		}
		System.out.println("count is : >> "+count);
	}
	public static void regex2(){
		//Pattern p=Pattern.compile("[abc]");
		Pattern p=Pattern.compile("[^abc]");
		Matcher m=p.matcher("a3b#k@9z");
		while(m.find()){
			count++;
			System.out.println("start is : "+m.start()+", end is : "+m.end()+", group is : "+m.group());
		}
		System.out.println("count is : >> "+count);
		 
	}
	public static void regex3PredefindChar(){
		//Pattern p=Pattern.compile("[abc]");
		//Pattern p=Pattern.compile("\\d");
		//Pattern p=Pattern.compile("\\D");
		Pattern p=Pattern.compile("\\s");
		Matcher m=p.matcher("a3b# k@9z");
		while(m.find()){
			count++; 
			System.out.println("start is : "+m.start()+", end is : "+m.end()+", group is : "+m.group());
		}
		System.out.println("count is : >> "+count);
	
	}	
	public static void regex4Quantifier(){
		
		//Pattern p=Pattern.compile("a");
		//Pattern p=Pattern.compile("a+");
		//Pattern p=Pattern.compile("a*");
		Pattern p=Pattern.compile("a?");
		
		Matcher m=p.matcher("abaabaaab");
		while(m.find()){
			count++; 
			System.out.println("start is : "+m.start()+", end is : "+m.end()+", group is : "+m.group());
		}
		System.out.println("count is : >> "+count);
	}	
	
	public static void regex5Split(){
		int count=0;
		Pattern p=Pattern.compile("\\s");
		String[] str=p.split("Durga Software Solution");
		for(String str2:str){
			count++; 
			System.out.println(str2);
		}
		System.out.println("count is : >> "+count);
	}	
	public static void regex6Split(){
		int count=0;
		Pattern p=Pattern.compile("o");
		String[] str=p.split("Durga Software Solution");
		for(String str2:str){
			count++; 
			System.out.println(str2);
		}
		System.out.println("count is : >> "+count);
	}	
	public static void regex7Split(){
		int count=0;
		//Pattern p=Pattern.compile("[.]"); //or below line
		Pattern p=Pattern.compile("\\.");
		String[] str=p.split("www.durgasoft.com");
		for(String str2:str){
			count++; 
			System.out.println(str2);
		}
		System.out.println("count is : >> "+count);
	}	
	public static void stringTokenizer1(){
		int count=0;
		StringTokenizer st=new StringTokenizer("Durga Software Solution ");
		 
		while(st.hasMoreTokens()){
			count++; 
			System.out.println(st.nextToken());
		}
		System.out.println("count is : >> "+count);
	}	
	public static void stringTokenizer2(){
		int count=0;
		StringTokenizer st=new StringTokenizer("19-07-2017", "-");
		 
		while(st.hasMoreTokens()){
			count++; 
			System.out.println(st.nextToken());
		}
		System.out.println("count is : >> "+count);
	}	
	
	
	
}
