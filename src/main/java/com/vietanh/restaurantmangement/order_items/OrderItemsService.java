package com.vietanh.restaurantmangement.order_items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemsService {
    @Autowired
    private OrderItemsRepositories orderItemsRepositories;

    public List<OrderItems> getOrderItems() {
        return orderItemsRepositories.findAll();
    }

    public OrderItems getOrderItemsById(Long id) {
        return orderItemsRepositories.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }

    public List<OrderItems> findBillByOrderId(Long order_id) {
        return orderItemsRepositories.findBillByOrderId(order_id);
    }

    public OrderItems insertOrderItems(OrderItems orderItems) {
        Integer price = orderItemsRepositories.findPriceById(orderItems.getItems().getId());
        // orderItems.setTotalPrice(Double.valueOf(price * orderItems.getQuantity()));
        // Integer price = orderItems.getItems().getPrice();
        orderItems.setTotalPrice(Double.valueOf(price * orderItems.getQuantity()));
        return orderItemsRepositories.save(orderItems);
    }
}
