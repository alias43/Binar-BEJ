package org.BinarBEJ.Challenge4.service;

import org.BinarBEJ.Challenge4.model.Product;

public interface ProductService {
    Product addNewProduct(Product product);

    Product updateProduct(Product product);
}
