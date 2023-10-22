package org.BinarBEJ.Challenge5.service;

import org.BinarBEJ.Challenge5.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    User updateUser(Long id , User user);

    void deleteUser(Long id);

    List<User> getAllUsers();
}
