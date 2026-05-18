package com.vietanh.restaurantmangement.items;

import com.vietanh.restaurantmangement.enums.Status;
import com.vietanh.restaurantmangement.model.ItemsEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_table")
public class Items extends ItemsEntity {
    @Column(name = "price")
    private Integer price;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    public Integer getPrice() {
        return price;
    }

    public Status getStatus() {
        return status;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
