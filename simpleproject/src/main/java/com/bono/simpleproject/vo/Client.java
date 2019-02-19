package com.bono.simpleproject.vo;

public class Client {
	private int clientId;
	private String clientPw;
	private String clientName;
	private String clientAddr;
	private String clientPhone;
	private int branchCode;
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientPw() {
		return clientPw;
	}
	public void setClientPw(String clientPw) {
		this.clientPw = clientPw;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientAddr() {
		return clientAddr;
	}
	public void setClientAddr(String clientAddr) {
		this.clientAddr = clientAddr;
	}
	public String getClientPhone() {
		return clientPhone;
	}
	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientPw=" + clientPw + ", clientName=" + clientName
				+ ", clientAddr=" + clientAddr + ", clientPhone=" + clientPhone + ", branchCode=" + branchCode + "]";
	}
}
