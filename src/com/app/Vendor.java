package com.app;

public class Vendor {
	private int venId;
	private String venName;
	private double venSal;
	public int getVenId() {
		return venId;
	}
	public void setVenId(int venId) {
		this.venId = venId;
	}
	public String getVenName() {
		return venName;
	}
	public void setVenName(String venName) {
		this.venName = venName;
	}
	public double getVenSal() {
		return venSal;
	}
	public void setVenSal(double venSal) {
		this.venSal = venSal;
	}
	@Override
	public String toString() {
		return "Vendor [venId=" + venId + ", venName=" + venName + ", venSal=" + venSal + "]";
	}
	

}
