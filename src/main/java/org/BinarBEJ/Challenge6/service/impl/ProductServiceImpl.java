package org.BinarBEJ.Challenge6.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.BinarBEJ.Challenge6.model.Product;
import org.BinarBEJ.Challenge6.repository.ProductRepository;
import org.BinarBEJ.Challenge6.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addNewProduct(Product product) {
        log.info("Produk Baru berhasil ditambahkan");
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long productCode, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productCode) {

    }

    @Override
    public List<Product> findAllProducts() {
        productRepository.findAll();
        return null;
    }

}
