package com.vietanh.restaurantmangement.customer;

import com.vietanh.restaurantmangement.model.PersonEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_table")
public class Customer extends PersonEntity {
    @Column
    private String customerLevel;

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }
}
