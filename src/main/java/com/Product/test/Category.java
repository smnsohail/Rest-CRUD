package com.Product.test;

import jakarta.persistence.*;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Page<Category> getAllCategories(Pageable pageable) {

        throw new UnsupportedOperationException("Unimplemented method 'getAllCategories'");
    }

    public Category createCategory(Category category) {

        throw new UnsupportedOperationException("Unimplemented method 'createCategory'");
    }

    public Optional<Category> getCategoryById(Long id2) {

        throw new UnsupportedOperationException("Unimplemented method 'getCategoryById'");
    }

    public Category updateCategory(Long id2, Category categoryDetails) {

        throw new UnsupportedOperationException("Unimplemented method 'updateCategory'");
    }

    public void deleteCategory(Long id2) {

        throw new UnsupportedOperationException("Unimplemented method 'deleteCategory'");
    }
}
