package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    void updateUser(User user);

    void deleteUserById(long id);

    User findById(long id);

    User findByUsername(String username);

    Role saveRole(Role role);
}
