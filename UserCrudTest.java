package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserCrudTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void executeDatabaseCrudSequence() {
        System.out.println("\n================= INITIALIZING DATA JPA TESTS =================");

        // 1. CREATE
        User studentA = userRepository.save(new User("John Doe", "john.doe@aditya.edu.in"));
        User studentB = userRepository.save(new User("Alice Smith", "alice.s@aditya.edu.in"));
        System.out.println("[CREATE] Success! Injected persistent models inside H2 database instance context.");

        // 2. READ ALL
        List<User> activeUsers = userRepository.findAll();
        System.out.println("[READ ALL] Displaying existing user schema records below:");
        activeUsers.forEach(System.out::println);

        // 3. UPDATE
        userRepository.findById(studentA.getId()).ifPresent(existingUser -> {
            existingUser.setName("John Developer");
            userRepository.save(existingUser);
            System.out.println("[UPDATE] Success! Synchronized altered fields to record ID: " + existingUser.getId());
        });

        System.out.println("[READ INDIVIDUAL] Verifying changes made to record ID " + studentA.getId() + ":");
        userRepository.findById(studentA.getId()).ifPresent(System.out::println);

        // 4. DELETE
        userRepository.deleteById(studentB.getId());
        System.out.println("[DELETE] Terminated record row with ID: " + studentB.getId());

        long runtimeRecordCount = userRepository.count();
        System.out.println("[COUNT] Remaining database row total: " + runtimeRecordCount);
        System.out.println("================== DATA JPA TESTS COMPLETED ==================\n");
    }
}
