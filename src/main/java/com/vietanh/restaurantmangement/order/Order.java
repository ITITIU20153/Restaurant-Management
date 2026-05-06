package com.vietanh.restaurantmangement.order;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.vietanh.restaurantmangement.customer.Customer;
import com.vietanh.restaurantmangement.model.BaseEntity;
import com.vietanh.restaurantmangement.model.ItemsEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order extends ItemsEntity {
    @CreationTimestamp
    @Column(name = "order_time", updatable = false)
    private LocalDateTime dt;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Override
    public Long getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }

    public LocalDateTime getDt() {
        return dt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
