package org.capg.apps.problemstatement2;

import org.capg.apps.problemstatement2.beans.Employee;
import org.capg.apps.problemstatement2.beans.SBU;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {

	public static void main( String[] args )
    {
		App2 app=new App2();
		app.start();
    }

	private void start() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		//SBU sbu=context.getBean(SBU.class);
		
	     Employee employee=context.getBean(Employee.class);
	    display(employee);
		
	}
	public void display(Employee employee) {
		SBU sbu=employee.getSbu();
		System.out.println("Employee Details");
		System.out.println("-----------------------------------");
		System.out.println("EmployeeId=" + employee.getEmployeeId()+ "\nEmployeeName=" + employee.getEmployeeName()+ "\nSalary=" + employee.getSalary());
		System.out.println("SBU details: ");
		System.out.println("sbuId "+sbu.getSbuId()+ "sbuName "+sbu.getSbuName()+"sbuHead "+sbu.getSbuHead());

	}

}
