package com.vietanh.restaurantmangement.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vietanh.restaurantmangement.system.BcryptPassword;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User with id " + id + " not found"));
    }

    public Boolean checkUserByUserName(String userName) {
        return userRepository.existsByUserName(userName);
    }

    public User createUser(User user) {
        if (checkUserByUserName(user.getUserName())) {
            throw new RuntimeException("Username already exists");
        }
        user.setPassWord(new BcryptPassword().encode(user.getPassWord()));
        return userRepository.save(user);
    }
}
