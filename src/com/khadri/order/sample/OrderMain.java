package com.khadri.order.sample;

import java.util.ArrayList;
import java.util.Scanner;

import com.khadri.order.sample.util.OrderDataUtil;

public class OrderMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean boo = false;
		ArrayList<OrderData> al = new ArrayList<OrderData>();
		System.out.println("Welcome to Order Portal");
		do {

			System.out.println("Enter Order Name : ");
			String orderName = scanner.next();

			System.out.println("Enter Order Qty : ");
			Integer orderQty = scanner.nextInt();
			OrderData data = OrderDataUtil.createOrderData(orderName, orderQty);
			al.add(data);
			System.out.println("Do you want me to contiue?(yes/no)");
			String decision = scanner.next();
			if (decision.equals("yes")) {
				boo = true;
			} else {
				boo = false;
			}
		} while (boo);

		scanner.close();

	}

}
