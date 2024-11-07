package org.example.repository;

import org.example.models.Position;
import org.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1L, "Arturo", "Rodriguez", new Position(-74.0060, 40.7128), "123456", "Yes", "1234-5678-9012"));
        users.add(new User(2L, "Juan", "Becerra", new Position(-118.2437, 34.0522), "654321", "No", null));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
