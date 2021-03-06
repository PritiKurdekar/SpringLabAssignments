package org.capg.apps.problemstatement2.beans;

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

	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	
	
}
