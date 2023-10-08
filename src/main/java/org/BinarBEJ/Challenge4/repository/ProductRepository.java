package org.BinarBEJ.Challenge4.repository;

import org.BinarBEJ.Challenge4.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findById(Long productId);

    List<Product> findAll();

    void deleteById(Long productId);

    @Query("SELECT p FROM Product p WHERE p.productName LIKE %?1%")
    List<Product> findByProductName(String productName);
}

