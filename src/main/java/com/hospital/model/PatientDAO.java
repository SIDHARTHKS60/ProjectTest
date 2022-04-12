package com.hospital.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hospital.model.*;
public class PatientDAO {
	
	public int addPatient(Patient patient) throws ClassNotFoundException,SQLException {
		 int count =0;
		String sql= "insert into patient values(?,?,?,?)";
	
		Connection con=CreateConnection.getConnection();
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(1,patient.getPatientid());
		prst.setString(2,patient.getName());
		prst.setString(3, patient.getAddress());
		prst.setInt(4, patient.getPhone());
		
		count=prst.executeUpdate();
		
		return count;	}

	public Patient viewPatient(int pid)throws ClassNotFoundException,SQLException  {
	    Patient p=new Patient();
		Connection con=CreateConnection.getConnection();
		String sql= "select * from patient where ptid=?";
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(1, pid);
		ResultSet rs=prst.executeQuery();
	
		while(rs.next()) {
			p.setPatientid(rs.getInt("ptid"));
			p.setName(rs.getString("ptname"));
			p.setAddress(rs.getString("ptaddr"));
			p.setPhone(rs.getInt("phno")); }
		return p; }
	
	public  int updatePatient(int ptid,String ptname,String ptaddr,long phno)throws ClassNotFoundException,SQLException {
		Connection con=CreateConnection.getConnection();
		String sql="update patient set ptname=?,ptaddr=?,phno=? where ptid=?";
		
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(4,ptid);
		prst.setString(1, ptname);
		prst.setString(2, ptaddr);
		prst.setLong(3,phno);
		
		int c=prst.executeUpdate();
	    return c;  }
	
	public int deletePatient(int ptid)throws ClassNotFoundException,SQLException {
		Patient p=new Patient();
		Connection con=CreateConnection.getConnection();
		String sql= "delete from patient where ptid=?";
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(1,ptid);
		int c=prst.executeUpdate();
		return c; 	}

}
