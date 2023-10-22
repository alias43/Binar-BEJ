package org.BinarBEJ.Challenge5.service;

import org.BinarBEJ.Challenge5.model.Order;

import java.util.List;


public interface OrderService {

    Order createOrder(Order order);

    List<Order> getAllOrders();
}
