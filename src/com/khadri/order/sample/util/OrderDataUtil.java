package com.khadri.order.sample.util;

import com.khadri.order.sample.OrderData;

public class OrderDataUtil {
	public static OrderData createOrderData(String orderName, Integer orderQty) {
		OrderData data = new OrderData();
		data.setOrderName(orderName);
		data.setOrderQty(orderQty);
		return data;
	}
}
