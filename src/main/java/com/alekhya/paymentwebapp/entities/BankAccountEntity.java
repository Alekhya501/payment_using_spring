package com.alekhya.paymentwebapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity

@Table(name="BankAccounts")
public class BankAccountEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bank_account_id")
	private int bankaccountid;
	@Column(name="bank_account_no")
	private String bankaccountno;
	@Column(name="ifsc")
	private String ifsc;
	@Column(name="bank_name")
	private String bankname;
	@Column(name="bank_branch")
	private String branch;
	@Column(name="isactive")
	private String isActive;
	@Column(name="balance")
	private long currentBalance;
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity user;
	public BankAccountEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccountEntity(int bankaccountid, String bankaccountno, String ifsc, String bankname, String branch,
			String isActive, long currentBalance, UserEntity user) {
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
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	
}
