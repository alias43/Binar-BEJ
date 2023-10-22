package org.BinarBEJ.Challenge5.repository;

import org.BinarBEJ.Challenge5.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}

