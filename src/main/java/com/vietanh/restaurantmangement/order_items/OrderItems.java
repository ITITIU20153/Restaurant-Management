package com.vietanh.restaurantmangement.order_items;

import com.vietanh.restaurantmangement.items.Items;
import com.vietanh.restaurantmangement.model.BaseEntity;
import com.vietanh.restaurantmangement.order.Order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_items_table")
public class OrderItems extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "items_id")
    private Items item;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "quantity")
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name = "total_price")
    private Double totalPrice;

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Items getItems() {
        return item;
    }

    public void setItems(Items item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
