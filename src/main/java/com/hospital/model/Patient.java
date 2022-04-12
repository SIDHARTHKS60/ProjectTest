package com.hospital.model;

 public class Patient {

	private int  ptid;
	private String ptname;
	private String ptaddr;
	private int phno;
	
	public int getPatientid() {
		return ptid;}
	
	public void setPatientid(int patientid) {
		this.ptid = patientid; }
	
	public String getName() {
		return ptname; }
	
	public void setName(String name) {
		this.ptname = name; }
	
	public String getAddress() {
		return ptaddr; }
	
	public void setAddress(String address) {
		this.ptaddr = address; }
	
	public int  getPhone() {
		return phno;  }
	
	public void setPhone(int phone) {
		this.phno = phone;  }
}

