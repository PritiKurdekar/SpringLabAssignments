package org.capg.apps.problemstatement3.beans;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee{
	
	private int age;

	@Value("${employeeId}")
	private int employeeId;

	
	private String employeeName;

	
	private double salary;


	public Employee() {

	}

	public Employee(int employeeId, String employeeName, double salary,int age) {
		// super();
		this.age = age;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		
	}

	public int getAge() {
		return age;
	}

	public int getEmployeeId() {
		return employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}

	public double getSalary() {
		return salary;
	}

}
