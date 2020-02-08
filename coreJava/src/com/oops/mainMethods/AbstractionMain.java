package com.oops.mainMethods;
import com.oops.implementations.EmployeeReport;
import com.oops.implementations.SalaryReport;
import com.oops.interfaces.Report;
import com.oops.model.ReportContext;

public class AbstractionMain {
	public static void main(String[] args) {
		abstractionUsingInterfce1();
	}
	public static void abstractionUsingInterfce1() {
		ReportContext reportContext = new ReportContext();
		Report eReport = new EmployeeReport();
		eReport.run(reportContext);
		Report sReport = new SalaryReport();
		sReport.run(reportContext);
	}


}
