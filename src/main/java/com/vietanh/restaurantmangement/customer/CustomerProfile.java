package com.vietanh.restaurantmangement.customer;

import com.vietanh.restaurantmangement.model.BaseEntity;
import com.vietanh.restaurantmangement.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_table")
public class CustomerProfile extends BaseEntity {
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "customer_level")
    private String customerLevel;

}
