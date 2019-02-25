package com.bono.simpleproject.vo;

public class Account extends Client{
	private String accountNumber;
	private int clientId;
	private String accountName;
	private int accountDeposit;
	private String accountBranch;
	private String accountManager;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountDeposit() {
		return accountDeposit;
	}
	public void setAccountDeposit(int accountDeposit) {
		this.accountDeposit = accountDeposit;
	}
	public String getAccountBranch() {
		return accountBranch;
	}
	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}
	public String getAccountManager() {
		return accountManager;
	}
	public void setAccountManager(String accountManager) {
		this.accountManager = accountManager;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", clientId=" + clientId + ", accountName=" + accountName
				+ ", accountDeposit=" + accountDeposit + ", accountBranch=" + accountBranch + ", accountManager="
				+ accountManager + "]";
	}

}
