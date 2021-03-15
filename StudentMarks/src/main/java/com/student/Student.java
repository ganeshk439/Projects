package com.student;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int sid;
	private String sname;
	private String sfee;
	private List<String> ls;
	private Set<String> ss1;
	private Map<String,Integer> map1;
	Address adr;
	public Map<String, Integer> getMap1() {
		return map1;
	}
	public void setMap1(Map<String, Integer> map1) {
		this.map1 = map1;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public Set<String> getSs1() {
		return ss1;
	}
	public void setSs1(Set<String> ss1) {
		this.ss1 = ss1;
	}
	public List<String> getLs() {
		return ls;
	}
	public void setLs(List<String> ls) {
		this.ls = ls;
	}
	public Student() {
		super();
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
	public String getSfee() {
		return sfee;
	}
	public void setSfee(String sfee) {
		this.sfee = sfee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", ls=" + ls + ", ss1=" + ss1 + ", map1="
				+ map1 + ", adr=" + adr + "]";
	}
	
	
	
	

}
