package com.bharat.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String name;
	private int rollNo;
	private double marks;
	private int id;
	
	
	//Address address1;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", id=" + id + "]";
	}
	
	
	
	
	
	
	
	
}
