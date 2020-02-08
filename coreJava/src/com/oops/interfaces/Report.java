package com.oops.interfaces;

import java.util.List;

import com.oops.model.ReportContext;

public interface Report {
	List<Object> run(ReportContext reportContext); 	 
}
