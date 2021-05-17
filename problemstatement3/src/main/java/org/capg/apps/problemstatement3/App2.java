package org.capg.apps.problemstatement3;

import org.capg.apps.problemstatement3.beans.Employee;
import org.capg.apps.problemstatement3.beans.SBU;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {

	public static void main(String[] args) {
		App2 app = new App2();
		app.start();
	}

	private void start() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		SBU sbu = context.getBean(SBU.class);
		displayDetails(sbu);

	}

	public void displayDetails(SBU sbu) {
		System.out.println( "SBU Details : [ SBU Code : "+sbu.getSbuId()+" SBU Name : "+sbu.getSbuName()+" SBU Head : "+sbu.getSbuHead()+"]");

			System.out.println("Employee Details : ");
		for(Employee e:sbu.getEmpList()) {
			System.out.println("Employee [empAge : "+e.getAge()+" empId : "+e.getEmployeeId()+" empName : "+e.getEmployeeName()+" empSalary : "+e.getSalary()+"]" );
		}

}
}