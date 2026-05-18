package com.vietanh.restaurantmangement.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;

@MappedSuperclass
public class PersonEntity extends BaseEntity {
    @Column(name = "fullname")
    @NotBlank
    private String fullName;
    //
    @Column(name = "username", unique = true)
    @NotBlank
    private String userName;
    //
    @Column(name = "password")
    @NotBlank
    private String passWord;
    //
    @Column
    @NotBlank
    private String role;

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getRole() {
        return role;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
