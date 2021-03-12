package com.ganesh;

public class Address {
	private String Hno;
	private String dist;
	private String state;
	
	public String getHno() {
		return Hno;
	}
	public void setHno(String hno) {
		Hno = hno;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setState(String state) {
		this.state = state;
	}
}
