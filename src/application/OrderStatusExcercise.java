package application;

import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class OrderStatusExcercise {
	public static void executeOrder() {
		Order order = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
		
		OrderStatus.valueOf("PENDING_PAYMENT");
		
		System.out.print(order);
	}
}
