package org.BinarBEJ.Challenge6.service;

import org.BinarBEJ.Challenge6.model.Order;

import java.util.List;


public interface OrderService {

    Order createOrder(Order order);

    List<Order> getAllOrders();
}
