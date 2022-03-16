package com.te.javabasics.assignment;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	int rollNo;
	String name;
	int age;
	double marks;
	String address;

	public Student(int rollNo, String name, int age, double marks, String address) {
//		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.address = address;
	}

	@Override
	public int compare(Student o1, Student o2) {
		
		return 0;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", marks=" + marks + ", address="
				+ address + "]";
	}

}
