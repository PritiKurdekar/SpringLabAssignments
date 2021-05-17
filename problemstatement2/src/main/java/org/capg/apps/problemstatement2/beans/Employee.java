package org.capg.apps.problemstatement2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee{
	@Value("${age}")
	private int age;

	@Value("${employeeId}")
	private int employeeId;

	@Value("${employeeName}")
	private String employeeName;

	@Value("${salary}")
	private double salary;

	
	private SBU sbu;

	public Employee() {

	}

	public Employee(int age, int employeeId, String employeeName, double salary, SBU sbu) {
		// super();
		this.age = age;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.sbu = sbu;

	}

	public int getAge() {
		return age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public SBU getSbu() {
		return sbu;
	}
	@Autowired
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}

	
	
}
