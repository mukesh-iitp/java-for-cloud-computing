package com.example.demo;

public class Order {
	private int orderID;
	private String orderName;

	public Order() {

	}

	public Order(int orderID, String orderName) {
		this.orderID = orderID;
		this.orderName = orderName;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", orderName=" + orderName + "]";
	}

}
