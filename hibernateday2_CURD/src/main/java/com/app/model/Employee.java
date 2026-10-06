package com.app.model;

import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Employee_Name")
	private String name;
	
	@Column(name="Employee_Salary")
	private float salary;
	
	@Column(name="Employee_Department")
	private String department;
	
	@Column(name="Employee_Age")
	private int age;
	
	@Column(name="Employee_Address")
	private String address;
	
	@Column(name="Employee_Mobno")
	private long mobno;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	
	
}
