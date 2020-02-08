package com.interv2;

public class EmpPojo {
	private int empId;
	private String empName;
	private int empSalary;
	private String compName;
	private String mobile;
	
	
	
	
	public EmpPojo(int empId, String empName, int empSalary, String compName, String mobile) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.compName = compName;
		this.mobile = mobile;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
