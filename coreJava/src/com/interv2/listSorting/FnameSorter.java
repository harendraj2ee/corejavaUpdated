package com.interv2.listSorting;

import java.util.Comparator;

public class FnameSorter implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getFname().compareTo(o2.getFname());
	}

	

}
