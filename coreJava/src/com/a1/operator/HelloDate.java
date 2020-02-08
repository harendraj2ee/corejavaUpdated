package com.a1.operator;
import java.util.Date;
import java.util.Random;

public class HelloDate {
	public static void main(String[] args) {
		HelloDate obj = new HelloDate();
		System.out.println("Hello java .....");
		obj.m1ShowDate();
		m2showProperties();
		m3Percentage();
		m4MathOps();
		m5AutoIncre();
		m6Equivalence();
		m7EqalsMethod();
		m8Bool();
		
	}

	public void m1ShowDate() {
		System.out.println("date >> " + new Date());
	}

	public static void m2showProperties() {
		System.getProperties().list(System.out);
		System.out.println("show Properties >> " + System.getProperty("user.name"));
		System.out.println("java Path >> " + System.getProperty("java.library.path"));
	}
	public static void m3Percentage(){
		int x=1,y=2,z=3;
		int a=x+y-2/2+z;
		int b=x+(y-2)/(2+z);
		System.out.println("a = "+a +" b = "+b);
	}
	public static void m4MathOps(){
		Random rand=new Random();
		int i,j,k;
		j=rand.nextInt(100)+1;
		System.out.println("j : "+j);
		k=rand.nextInt(100)+1;
		System.out.println("k : "+k);
		i=j+k;
		System.out.println("j+k : "+i);
		i=j-k;
		System.out.println("j-k : "+i);
		i=k/j;
		System.out.println("k/j : "+i);
		i=k*j;
		System.out.println("k*j : "+i);
		i=k%j;
		System.out.println("k%j : "+i);
		j%=k;
		System.out.println("j%=k : "+j);
		float u,v,w;
		v=rand.nextFloat();
		System.out.println("v : "+v);
		w=rand.nextFloat();
		System.out.println("w : "+w);
		u=v+w;	
		System.out.println("v+w : "+u);
		u=v-w;
		System.out.println("v-w : "+u);
		u=v*w;
		System.out.println("v*w : "+u);
		u=v/w;
		System.out.println("v/w : "+u);
		u+=v;
		System.out.println("u+=v "+u);
		u-=v;
		System.out.println("u-=v : "+u);
		u*=v;
		System.out.println("u*=v : "+u);
		u/=v;
		System.out.println("u/=v : "+u);
	}
	public static void m5AutoIncre(){
		int i=1;
		System.out.println("auto i : "+i);
		System.out.println("auto ++i : "+ ++i);
		System.out.println("auto i++ : "+ i++ );
		System.out.println("auto incre i : "+i);
		System.out.println("auto --i : "+ --i);
		System.out.println("auto i-- : "+ i--);
		System.out.println("auto after decr  i ::: "+i);
	}
	public static void m6Equivalence(){
		Integer n1=new Integer(47);
		Integer n2=new Integer(47);
		System.out.println(n1==n2);
		System.out.println(n1!=n2);
	}
	public static void m7EqalsMethod(){
		Integer n1=new Integer(47);
		Integer n2=new Integer(47);
		System.out.println(n1.equals(n2));
	}
	public static void m8Bool(){
		Random rand=new Random();
		int i=rand.nextInt(100);
		int j=rand.nextInt(100);
		System.out.println("i = "+i);System.out.println("j = "+j);System.out.println("i > j is = "+(i>j));
		System.out.println("i<j is "+(i<j));System.out.println("i >= j is "+(i >= j));System.out.println("i<=j is "+(i<=j));
		System.out.println("i==j is "+(i==j));System.out.println("i!=j is "+(i!=j));
		
	}
	
}
