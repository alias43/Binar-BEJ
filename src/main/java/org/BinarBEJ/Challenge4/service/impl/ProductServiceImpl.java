package org.BinarBEJ.Challenge4.service.impl;

import org.BinarBEJ.Challenge4.model.Product;
import org.BinarBEJ.Challenge4.repository.ProductRepository;
import org.BinarBEJ.Challenge4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addNewProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
}
