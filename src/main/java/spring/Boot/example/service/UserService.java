package spring.Boot.example.service;

import spring.Boot.example.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void deleteUser(Long id);

    User getUser(Long id);

    List<User> getAllUsers();

    void userChange(User user, Long id);
}