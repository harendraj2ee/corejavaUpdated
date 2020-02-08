package com.interv2.listSorting;

import java.util.Comparator;

public class LnameSorter implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getLname().compareTo(o2.getLname());
	}

}
