package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shop {

	@Id
	private int sid;
	private String sname;
	private String scity;
	private String smob;
	
	
	public Shop(int sid, String sname, String scity, String smob) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.smob = smob;
	}


	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getScity() {
		return scity;
	}


	public void setScity(String scity) {
		this.scity = scity;
	}


	public String getSmob() {
		return smob;
	}


	public void setSmob(String smob) {
		this.smob = smob;
	}


	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", smob=" + smob + "]";
	}
	
	
	
	
	
}
