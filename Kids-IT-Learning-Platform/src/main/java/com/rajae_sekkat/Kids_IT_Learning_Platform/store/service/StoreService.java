package com.rajae_sekkat.Kids_IT_Learning_Platform.store.service;

import com.rajae_sekkat.Kids_IT_Learning_Platform.store.dto.ProductDto;
import com.rajae_sekkat.Kids_IT_Learning_Platform.store.entity.Product;
import com.rajae_sekkat.Kids_IT_Learning_Platform.store.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreService {

    private final ProductRepository productRepository;

    public StoreService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> findAllProducts() {
        return productRepository.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    private ProductDto mapToDto(Product product) {
        return new ProductDto(
                product.getId(),
                product.getTitle(),
                product.getDescription(),
                product.getPrice(),
                product.getOriginalPrice(),
                product.getImageUrl(),
                product.getBadge(),
                product.getRating(),
                product.getReviewCount(),
                product.getCategory(),
                product.getFeatured(),
                product.getBestSeller(),
                product.getIsNew(),
                product.getSeller() != null ? product.getSeller().getName() : null,
                product.getSeller() != null ? product.getSeller().getSlug() : null
        );
    }
}
