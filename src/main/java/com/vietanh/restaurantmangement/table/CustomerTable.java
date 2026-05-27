package com.vietanh.restaurantmangement.table;

import com.vietanh.restaurantmangement.customer.CustomerProfile;
import com.vietanh.restaurantmangement.model.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "customer_table_table")
public class CustomerTable extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerProfile customer;
    @ManyToOne
    @JoinColumn(name = "table_id")
    private TableEntity table;

}
