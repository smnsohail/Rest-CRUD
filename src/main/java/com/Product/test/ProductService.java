package com.Product.test;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @SuppressWarnings("unused")
    @Autowired
    private ProductRepository productRepository;

    public Page<Product> getAllProducts(Pageable pageable) {

        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

    public Product createProduct(Product product) {

        throw new UnsupportedOperationException("Unimplemented method 'createProduct'");
    }

    public Optional<Product> getProductById(Long id) {

        throw new UnsupportedOperationException("Unimplemented method 'getProductById'");
    }

    public Product updateProduct(Long id, Product productDetails) {

        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    public void deleteProduct(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteProduct'");
    }

}
