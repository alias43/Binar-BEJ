package org.BinarBEJ.Challenge5.repository;

import org.BinarBEJ.Challenge5.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
