package com.oops.services;

import java.util.HashSet;
import java.util.Set;

import com.oops.model.Student;

public class StudentImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<Student>();
		Student student = new Student();
		set.add(student);
		System.out.println(set);

	}

}
