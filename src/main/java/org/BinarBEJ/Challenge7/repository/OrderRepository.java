package org.BinarBEJ.Challenge7.repository;

import org.BinarBEJ.Challenge7.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
