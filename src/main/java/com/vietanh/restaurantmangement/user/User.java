package com.vietanh.restaurantmangement.user;

import com.vietanh.restaurantmangement.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_table")
public class User extends BaseEntity {

    //
    @Column(name = "username", unique = true)
    @NotBlank
    private String userName;
    //
    @Column(name = "password")
    @NotBlank
    private String passWord;
    //
    @Column(name = "role")
    @NotBlank
    private String role;
}
