package com.spring;

public class Employee {
	
	int eid;
	String ename;
	String eaddress;
	Manager manager;
	
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Employee(int eid, String ename, String eaddress,Manager manager) {
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.manager = manager;
	}
	
	public Employee() {
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", manager=" + manager + "]";
	}
	
	
}
