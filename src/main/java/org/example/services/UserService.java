package org.example.services;

import org.example.models.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User updatedUser) {
        User existingUser = userRepository.findById(id);
        if (existingUser != null) {
            existingUser.setName(updatedUser.getName());
            existingUser.setLastname(updatedUser.getLastname());
            existingUser.setPosition(updatedUser.getPosition());
            existingUser.setNumber(updatedUser.getNumber());
            existingUser.setHasCard(updatedUser.getHasCard());
            existingUser.setCardNumber(updatedUser.getCardNumber());
            return userRepository.save(existingUser);
        }
        return null;
    }


}
