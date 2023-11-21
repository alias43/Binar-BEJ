package org.BinarBEJ.Challenge7.repository;

import org.BinarBEJ.Challenge7.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}

