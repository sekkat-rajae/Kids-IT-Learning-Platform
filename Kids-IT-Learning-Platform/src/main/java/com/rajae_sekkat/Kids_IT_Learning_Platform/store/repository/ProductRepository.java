package com.rajae_sekkat.Kids_IT_Learning_Platform.store.repository;

import com.rajae_sekkat.Kids_IT_Learning_Platform.store.entity.Product;
import com.rajae_sekkat.Kids_IT_Learning_Platform.store.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(ProductCategory category);
    List<Product> findBySellerName(String sellerName);
}
