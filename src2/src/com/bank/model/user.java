package com.bank.model;

import java.io.Serializable;

public class user implements Serializable  {
 String firstname;
String lastname;
long adharno;
long accountno; 
long accounttype;
String panNo;
long phone;
String address;
public long getAccounttype() {
	
	return accounttype;
}
public void setAccounttype(long accounttype) {
	this.accounttype = accounttype;
}

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public long getAdharno() {
	return adharno;
}
public void setAdharno(long adharno) {
	this.adharno = adharno;
}
public long getAccountno() {
	return accountno;
}
public void setAccountno(long accountno) {
	this.accountno = accountno;
}
public String getPanNo() {
	return panNo;
}
public void setPanNo(String panNo) {
	this.panNo = panNo;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
