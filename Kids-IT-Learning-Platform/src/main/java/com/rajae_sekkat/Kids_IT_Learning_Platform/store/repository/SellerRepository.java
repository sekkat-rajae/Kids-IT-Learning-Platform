package com.rajae_sekkat.Kids_IT_Learning_Platform.store.repository;

import com.rajae_sekkat.Kids_IT_Learning_Platform.store.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Optional<Seller> findBySlug(String slug);
    Optional<Seller> findByName(String name);
}
