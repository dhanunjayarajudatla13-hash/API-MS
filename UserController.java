package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // In-memory list to simulate database storage
    private final List<User> users = new ArrayList<>();

    public UserController() {
        users.add(new User(1L, "Alice Smith", "alice@example.com"));
        users.add(new User(2L, "Bob Jones", "bob@example.com"));
    }

    // CREATE
    @PostMapping
    public String createUser(@RequestBody User user) {
        users.add(user);
        return "User created successfully with ID: " + user.getId();
    }

    // READ (all)
    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    // READ (by id)
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // UPDATE
    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return "User updated successfully!";
            }
        }
        return "User not found!";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        boolean removed = users.removeIf(user -> user.getId().equals(id));
        if (removed) {
            return "User deleted successfully!";
        }
        return "User not found!";
    }
}
