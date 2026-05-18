package com.vietanh.restaurantmangement.table;

import java.time.LocalDateTime;

import com.vietanh.restaurantmangement.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tables_table")
public class TableEntity extends BaseEntity {
    @Column(name = "type")
    private TableTypeEnum type;
    @Column(name = "booking_time", updatable = false)
    private LocalDateTime bookTime;
    @Column(name = "is_available")
    private Boolean isAvailable;
    @Column(name = "number")
    private Integer number;

    public TableTypeEnum getType() {
        return type;
    }

    public void setType(TableTypeEnum type) {
        this.type = type;
    }

    public LocalDateTime getBookTime() {
        return bookTime;
    }

    public void setBookTime(LocalDateTime bookTime) {
        this.bookTime = bookTime;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}
