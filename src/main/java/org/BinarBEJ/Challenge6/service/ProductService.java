package org.BinarBEJ.Challenge6.service;

import org.BinarBEJ.Challenge6.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    Product addNewProduct(Product product);

    Product updateProduct(Long productCode , Product product);

    void deleteProduct(Long productCode);

    List<Product> findAllProducts();
}
