package org.BinarBEJ.Challenge4.service;

import org.BinarBEJ.Challenge4.model.Order;

import java.util.List;


public interface OrderService {

    Order createOrder(Order order);

    List<Order> getAllOrders();
}
