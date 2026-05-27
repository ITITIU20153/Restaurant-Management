package com.vietanh.restaurantmangement.order;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.vietanh.restaurantmangement.customer.CustomerProfile;
import com.vietanh.restaurantmangement.model.ItemsEntity;
import com.vietanh.restaurantmangement.order_items.OrderItems;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "order_table")
public class Order extends ItemsEntity {
    @CreationTimestamp
    @Column(name = "order_time", updatable = false)
    private LocalDateTime dt;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerProfile customer;
    @OneToMany(mappedBy = "order")
    private List<OrderItems> orderItems;
}
