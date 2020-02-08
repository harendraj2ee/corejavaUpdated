package com.oops.implementations;

import java.util.List;

import com.oops.interfaces.Report;
import com.oops.model.ReportContext;

public class EmployeeReport implements Report{

	@Override
	public List<Object> run(ReportContext reportContext) {
		// Custom Logic here
		System.out.println("Executing Employee Report...");
		reportContext.setName("Vijay Staymurti");
		reportContext.setAddress("Delhi");
		reportContext.setMobile(996844467);
		reportContext.setCompanyName("HCL");
		System.out.println(reportContext.getName());
		System.out.println(reportContext.getAddress());
		System.out.println(reportContext.getMobile());
		System.out.println(reportContext.getCompanyName());
		return null;
	}

}
