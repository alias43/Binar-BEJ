package org.BinarBEJ.Challenge6.repository;

import org.BinarBEJ.Challenge6.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}

