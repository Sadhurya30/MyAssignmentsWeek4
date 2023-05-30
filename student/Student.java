package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Ram");
	}
	
	public void studentDept() {
		System.out.println("ECE");
	}
	
	public void studentId() {
		System.out.println("111517106126");
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		//fmethods from college
		s1.collegeName();
		s1.collegeCode();
		s1.collegeRank();
		
		//methods from department
		s1.deptName();
		
		//methods from  student
		s1.studentDept();
		s1.studentId();
		s1.studentName();

	}

}
