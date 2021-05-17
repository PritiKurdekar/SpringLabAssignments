package org.capg.apps.problemstatement3;

import java.util.ArrayList;
import java.util.List;

import org.capg.apps.problemstatement3.beans.Employee;
import org.capg.apps.problemstatement3.beans.SBU;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:app.properties")
@ComponentScan("org.capg.apps.problemstatement2")
@Configuration
public class JavaConfig {
	@Bean
	public SBU getSbu() {
		SBU sbu=new SBU();
		List<Employee> empList=nameList();
		sbu.setEmpList(empList);
		return sbu;
	}
	
	

public List<Employee> nameList(){
	List<Employee> empList=new ArrayList<Employee>();
	Employee emp1=new Employee(12345, "Harry", 40000, 25);
	Employee emp2=new Employee(67890, "Mike", 30000, 24);

	empList.add(emp1);
	empList.add(emp2);
	return empList;
	
}

}
