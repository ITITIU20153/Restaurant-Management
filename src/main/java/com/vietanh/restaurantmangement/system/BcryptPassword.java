package com.vietanh.restaurantmangement.system;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptPassword {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public String encode(String password) {
        return encoder.encode(password);
    }

    public boolean matches(String password, String encodedPassword) {
        return encoder.matches(password, encodedPassword);
    }
}
