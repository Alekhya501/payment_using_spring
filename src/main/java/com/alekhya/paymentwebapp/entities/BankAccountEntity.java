package com.alekhya.paymentwebapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

}
