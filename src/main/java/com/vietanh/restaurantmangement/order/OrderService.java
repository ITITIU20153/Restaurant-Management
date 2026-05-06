package com.vietanh.restaurantmangement.order;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepositories orderRepositories;

    OrderService(OrderRepositories orderRepositories) {
        this.orderRepositories = orderRepositories;
    }

    public List<Order> getOrders() {
        return orderRepositories.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepositories
                .findById(id).orElseThrow(() -> new RuntimeException("Cannot find order"));
    }

    public Order createOrder(Order order) {
        return orderRepositories.save(order);
    }
}
