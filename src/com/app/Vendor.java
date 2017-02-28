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
	public Vendor() {
		
	}
	public Vendor(int venId) {
		
		this.venId = venId;
	}
	public Vendor(int venId, String venName) {
		
		this.venId = venId;
		this.venName = venName;
	}
	public Vendor(int venId, String venName, double venSal) {
		
		this.venId = venId;
		this.venName = venName;
		this.venSal = venSal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + venId;
		result = prime * result + ((venName == null) ? 0 : venName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(venSal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendor other = (Vendor) obj;
		if (venId != other.venId)
			return false;
		if (venName == null) {
			if (other.venName != null)
				return false;
		} else if (!venName.equals(other.venName))
			return false;
		if (Double.doubleToLongBits(venSal) != Double.doubleToLongBits(other.venSal))
			return false;
		return true;
	}
	
	
	
	

}
