package customerform;

import java.io.Serializable;

public class User implements Serializable{

	private String firstname;
	private long accountno; 
	private long phone;
	private long pwd;
	private long amount;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getPwd() {
		return pwd;
	}
	public void setPwd(long pwd) {
		this.pwd = pwd;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
	
	
}
