package org.capg.apps.problemstatement3.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	@Value("${sbuId}")
	private int sbuId;
	@Value("${sbuName}")
	private String sbuName;
	
	@Value("${sbuHead}")
	private String sbuHead;
	private List<Employee> empList;
	
	public SBU() {
		
	}
	
	public SBU(int sbuId, String sbuName, String sbuHead) {
		//super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}

	public int getSbuId() {
		return sbuId;
	}

	public String getSbuName() {
		return sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList=empList;
		
	}
	public List<Employee> getEmpList(){
		return empList;
	}

	
	
}
