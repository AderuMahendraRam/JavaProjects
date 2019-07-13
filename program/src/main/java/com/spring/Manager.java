package com.spring;

public class Manager {
	int mid;
	String mname;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", mname=" + mname + "]";
	}
	public Manager(int mid, String mname) {
		this.mid = mid;
		this.mname = mname;
	}
	public Manager(){
		
	}
	
}
