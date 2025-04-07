package com.khadri.order.sample;

import java.util.Scanner;

public class Order {
	String ordItemName;
	int ordQty;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ordItemName");
		String name = sc.nextLine();

		System.out.println("Enter your ordQty");
		int qty = sc.nextInt();
		System.out.println("Hello your ordItemName" + name + "ordQty is" + qty);
		sc.close();
	}

}
