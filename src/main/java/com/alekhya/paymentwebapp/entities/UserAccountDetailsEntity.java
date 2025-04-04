package com.alekhya.paymentwebapp.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="user_account_details")
public class UserAccountDetailsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_account_id")
	private long useraccountid;
	@Column(name="account_open_date")
	private Date account_open_date;
	@Column(name="wallet_balance")
	private long currentwalletbalance;
	@Column(name="wallet_pin")
	private String walletpin;
	@Column(name="linked_banaccount_count")
	private int linkedbankaccountcount;
	

}
