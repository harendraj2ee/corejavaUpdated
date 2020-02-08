package com.oops.mainMethods;

import com.oops.implementations.VarArgsImpl;
import com.oops.interfaces.VarArgumntsInterface;

public class Var_Arguments {
	public static void varArguments(int... arg_Args)
	{
		System.out.println("Var-Args Method");
	}
	public static void varArgumentsAdd(int... val1) {
		int total =0;
		for(int val2: val1) {
			total =total+val2;
		}
		System.out.println("The Sum of :: "+total);
	}
	public static void main(String[] args) {
		varArguments();
		varArguments(10);
		varArguments(10,20);
		varArguments(10,20,30,40);
		
		varArgumentsAdd();
		varArgumentsAdd(50,60);
		varArgumentsAdd(50);
		varArgumentsAdd(50,60,70,80);
		
		//Interface used while implements
		VarArgumntsInterface obj = new VarArgsImpl();
		//VarArgsImpl obj = new VarArgsImpl();
		obj.varArgumentInteface();
		
		//Using Interface adding Value and Var-Arguments on java 1.5 version
		
		obj.varArgumentAddInterface();
		obj.varArgumentAddInterface(100);
		obj.varArgumentAddInterface(100,200);
		obj.varArgumentAddInterface(100,200,300,400);
	}
}