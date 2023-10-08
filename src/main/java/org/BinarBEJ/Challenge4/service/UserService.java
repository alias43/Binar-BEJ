package org.BinarBEJ.Challenge4.service;

import org.BinarBEJ.Challenge4.model.Users;

public interface UserService {
    Users addUser(Users user);

    Users updateUser(Users user);
}
