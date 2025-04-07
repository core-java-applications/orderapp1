package com.khadri.order.sample;

public class OrderData {

	private String orderName;

	private int orderQty;

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}

	@Override
	public String toString() {
		return "OrderData [orderName=" + orderName + ", orderQty=" + orderQty + "]";
	}

}
