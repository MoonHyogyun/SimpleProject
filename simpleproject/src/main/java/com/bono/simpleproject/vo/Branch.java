package com.bono.simpleproject.vo;

public class Branch {
	private int branchCode;
	private String branchName;
	private String branchManager;
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchManager() {
		return branchManager;
	}
	public void setBranchManager(String branchManager) {
		this.branchManager = branchManager;
	}
	@Override
	public String toString() {
		return "Branch [branchCode=" + branchCode + ", branchName=" + branchName + ", branchManager=" + branchManager
				+ "]";
	}
}
