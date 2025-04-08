package com.alekhya.paymentwebapp.Dtos;

import com.alekhya.paymentwebapp.entities.UserEntity;

public class BankAccountDto {

	private int bankaccountid;
	private String bankaccountno;
	private String ifsc;
	private String bankname;
	private String branch;
	private String isActive;
	private long currentBalance;
	private UserDto user;
	public BankAccountDto(int bankaccountid, String bankaccountno, String ifsc, String bankname, String branch,
			String isActive, long currentBalance, UserDto user) {
		super();
		this.bankaccountid = bankaccountid;
		this.bankaccountno = bankaccountno;
		this.ifsc = ifsc;
		this.bankname = bankname;
		this.branch = branch;
		this.isActive = isActive;
		this.currentBalance = currentBalance;
		this.user = user;
	}
	public BankAccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBankaccountid() {
		return bankaccountid;
	}
	public void setBankaccountid(int bankaccountid) {
		this.bankaccountid = bankaccountid;
	}
	public String getBankaccountno() {
		return bankaccountno;
	}
	public void setBankaccountno(String bankaccountno) {
		this.bankaccountno = bankaccountno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public long getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(long currentBalance) {
		this.currentBalance = currentBalance;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	

}
