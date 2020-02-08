package com.oops.implementations;

import java.util.List;

import com.oops.interfaces.Report;
import com.oops.model.ReportContext;

public class SalaryReport implements Report {

	@Override
	public List<Object> run(ReportContext reportContext) {
		// Custom Logic here
		System.out.println("Executing Salary Report...");
		return null;
	}

}
