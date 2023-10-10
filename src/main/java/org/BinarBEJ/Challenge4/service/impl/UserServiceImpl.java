package org.BinarBEJ.Challenge4.service.impl;

import org.BinarBEJ.Challenge4.model.Users;
import org.BinarBEJ.Challenge4.repository.UserRepository;
import org.BinarBEJ.Challenge4.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users updateUser(Users user) {
        return userRepository.save(user);
    }
}
