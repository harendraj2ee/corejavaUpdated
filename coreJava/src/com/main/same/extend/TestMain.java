package com.main.same.extend;

public class TestMain {
	{
		System.out.println("hhhhhhhhhh");
	}
	static{
		System.out.println("Static block");
	}
	{
		System.out.println("INit blok");
	}
	public static void main(String args[]){
		
		System.out.println("main");{
			System.out.println("kkkk");{
				System.out.println("F");
			}
			{
				System.out.println("llllllllllllll");
			}
		}
		{
			System.out.println("check mmeeeee");
		}
	}

}
