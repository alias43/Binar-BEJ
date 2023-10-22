package org.BinarBEJ.Challenge5.repository;

import org.BinarBEJ.Challenge5.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}

