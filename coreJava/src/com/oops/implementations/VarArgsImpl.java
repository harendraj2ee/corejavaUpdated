package com.oops.implementations;

import com.oops.interfaces.VarArgumntsInterface;

public class VarArgsImpl implements VarArgumntsInterface {

	@Override
	public void varArgumentInteface(int... var_args) {
		System.out.println("Var-Args Method using Interface and Implementation class");
		
	}

	@Override
	public void varArgumentAddInterface(int... val1) {
		int total =0;
		for(int val2:val1) {
			total = total + val2;
		}
		
		System.out.println("The Sum of Val Using Interface :: "+total);
	}

	
}