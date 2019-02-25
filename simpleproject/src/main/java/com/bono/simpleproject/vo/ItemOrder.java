package com.bono.simpleproject.vo;

public class ItemOrder {
	private String orderDate;
	private int orderNumber;
	private int accountNumber;
	private int clientId;
	private String itemCode;
	private int orderCount;
	private int orderPrice;
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	@Override
	public String toString() {
		return "ItemOrder [orderDate=" + orderDate + ", orderNumber=" + orderNumber + ", accountNumber=" + accountNumber
				+ ", clientId=" + clientId + ", itemCode=" + itemCode + ", orderCount=" + orderCount + ", orderPrice="
				+ orderPrice + "]";
	}

	
}
