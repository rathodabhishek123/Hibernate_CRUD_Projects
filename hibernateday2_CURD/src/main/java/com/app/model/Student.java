package com.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Student_RollNo")
	private int rollno;
	
	@Column(name="Student_Name")
	private String name;
	
	@Column(name="Student_Marks")
	private float marks;
	
	@Column(name="Department")
	private String department;
	
	@Column(name="Student_Email")
	private String gamil;
	
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGamil() {
		return gamil;
	}
	public void setGamil(String gamil) {
		this.gamil = gamil;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", department=" + department
				+ ", gamil=" + gamil + "]";
	}

	
	
}
