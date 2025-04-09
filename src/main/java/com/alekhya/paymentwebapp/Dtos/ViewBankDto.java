package com.alekhya.paymentwebapp.Dtos;

public class ViewBankDto {
    private String bankAccountNo;
    private String ifsc;
    private String bankName;
    private long currentBalance;

    public ViewBankDto() {
        super();
    }

    public ViewBankDto(String bankAccountNo, String ifsc, String bankName, long currentBalance) {
        this.bankAccountNo = bankAccountNo;
        this.ifsc = ifsc;
        this.bankName = bankName;
        this.currentBalance = currentBalance;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }
}
