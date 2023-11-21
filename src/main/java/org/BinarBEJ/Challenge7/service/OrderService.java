package org.BinarBEJ.Challenge7.service;

import org.BinarBEJ.Challenge7.model.Order;

import java.util.List;


public interface OrderService {

    Order createOrder(Order order);

    List<Order> getAllOrders();
}
