package org.BinarBEJ.Challenge4.repository;

import org.BinarBEJ.Challenge4.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    Users findById(Long userId);

    List<Users> findAll();

    void deleteById(Long userId);

    @Query("SELECT u FROM User u WHERE u.username = ?1")
    Users findByUsername(String username);
}

