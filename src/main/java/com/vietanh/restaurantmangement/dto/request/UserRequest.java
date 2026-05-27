package com.vietanh.restaurantmangement.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRequest {
    private String userName;
    private String passWord;
}
