package com.inputOutputTasks;

import com.inputOutputTasks.model.User;
import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(int id) {
        User user = userRepository.findById(id);
        if (user == null) {
            throw new IllegalArgumentException("Can't find user with id: " + id);
        }
        return user;
    }

    public User save(User user) {
        if (userRepository.existsById(user.getId())) {
            return null;
        }
        return userRepository.save(user);
    }

    public boolean existsById(int id) {
        return userRepository.existsById(id);
    }

    public boolean deleteAll() {
        userRepository.deleteAll();
        return true;
    }

    public void delete(User user) {
        userRepository.delete(user);
    }
}
