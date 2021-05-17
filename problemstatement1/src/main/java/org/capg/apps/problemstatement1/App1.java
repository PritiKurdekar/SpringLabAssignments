package org.capg.apps.problemstatement1;



import org.capg.apps.problemstatement1.beans.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {

	public static void main( String[] args )
    {
        App1 app=new App1();
        app.start();
    }

	private void start() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
	       
		Employee employee=context.getBean(Employee.class);
		display(employee);
		
	}
	public void display(Employee employee) {
		System.out.println("Employee Details");
		System.out.println("-----------------------------------");
		System.out.println("EmployeeId=" + employee.getEmployeeId()+ "\nEmployeeName=" + employee.getEmployeeName()+ "\nSalary=" + employee.getSalary() + "\nBusinessUnit=" + employee.getBusinessUnit() + "\nAge=" + employee.getAge());
		
	}
}
