package com.oops.encapsulations;

public class EncapsulationMain {
	private String studentId;
	private String studentName;
		
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static void main(String[] args) {
		EncapsulationMain encMain = new EncapsulationMain();
		encMain.setStudentId("stu1234");
		encMain.setStudentName("Harendra Kumar Sah");
		System.out.println("StudentId >> "+encMain.getStudentId());
		System.out.println("StudentName >> "+encMain.getStudentName());

	}

}
