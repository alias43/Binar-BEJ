package org.BinarBEJ.Challenge4.service.impl;

import org.BinarBEJ.Challenge4.model.Order;
import org.BinarBEJ.Challenge4.repository.OrderRepository;
import org.BinarBEJ.Challenge4.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
