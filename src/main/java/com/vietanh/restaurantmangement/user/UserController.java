package com.vietanh.restaurantmangement.user;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vietanh.restaurantmangement.dto.response.APIResponse;
import com.vietanh.restaurantmangement.dto.response.UserResponse;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<User>> getUserService() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<APIResponse<UserResponse>> getUserById(@PathVariable Long id) {
        APIResponse<UserResponse> apiResponse = new APIResponse<>();
        try {
            User user = userService.getUserById(id);
            UserResponse userResponse = new UserResponse();
            userResponse.setFullName(user.getUserName());
            userResponse.setFullName(user.getRole());
            apiResponse.setStatus(200);
            apiResponse.setMessage("Get user successfully");
            return ResponseEntity.ok(apiResponse);
        } catch (RuntimeException e) {
            apiResponse.setStatus(404);
            apiResponse.setMessage(e.getMessage());
            return ResponseEntity.status(404).body(apiResponse);
        }
    }

    @PostMapping()
    public ResponseEntity<APIResponse<UserResponse>> createUser(@RequestBody User user) {

        APIResponse<UserResponse> apiResponse = new APIResponse<>();
        try {
            User savedUser = userService.createUser(user);
            UserResponse userResponse = new UserResponse();
            userResponse.setFullName(savedUser.getUserName());
            userResponse.setRole(savedUser.getRole());
            apiResponse.setStatus(201);
            apiResponse.setMessage("Create user successfully");
            apiResponse.setResult(userResponse);

            return ResponseEntity.status(201).body(apiResponse);
        } catch (RuntimeException e) {
            apiResponse.setStatus(409);
            apiResponse.setMessage(e.getMessage());

            return ResponseEntity.status(409).body(apiResponse);
        }
    }
}
