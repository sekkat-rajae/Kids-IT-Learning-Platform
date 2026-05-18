package com.rajae_sekkat.Kids_IT_Learning_Platform.store;

import com.rajae_sekkat.Kids_IT_Learning_Platform.store.entity.Product;
import com.rajae_sekkat.Kids_IT_Learning_Platform.store.entity.ProductCategory;
import com.rajae_sekkat.Kids_IT_Learning_Platform.store.entity.Seller;
import com.rajae_sekkat.Kids_IT_Learning_Platform.store.repository.ProductRepository;
import com.rajae_sekkat.Kids_IT_Learning_Platform.store.repository.SellerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class StoreDataLoader implements CommandLineRunner {

    private final SellerRepository sellerRepository;
    private final ProductRepository productRepository;

    public StoreDataLoader(SellerRepository sellerRepository, ProductRepository productRepository) {
        this.sellerRepository = sellerRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) {
        Seller seller = sellerRepository.findBySlug("kidoforge").orElseGet(() -> {
            Seller saved = sellerRepository.save(new Seller(
                    "KidoForge Official",
                    "kidoforge",
                    "The only seller for Kids IT Learning Platform."
            ));
            return saved;
        });

        if (productRepository.count() == 0) {
            List<Product> products = List.of(
                    new Product(
                            "AI for Kids: Interactive Learning Guide",
                            "A comprehensive, beginner-friendly guide introducing children to artificial intelligence through fun activities and interactive lessons.",
                            new BigDecimal("12.99"),
                            new BigDecimal("15.99"),
                            null,
                            "Best Seller",
                            5.0,
                            124,
                            ProductCategory.EBOOK,
                            true,
                            true,
                            false
                    ),
                    new Product(
                            "Robotics & Coding Educational Stickers",
                            "Beautiful, educational stickers featuring robots, circuits, and coding symbols. Perfect for decorating notebooks and inspiring creativity.",
                            new BigDecimal("8.50"),
                            null,
                            null,
                            null,
                            4.0,
                            89,
                            ProductCategory.CREATIVE_KIT,
                            false,
                            false,
                            false
                    ),
                    new Product(
                            "Parent's Guide to Tech Education",
                            "Essential guide for parents wanting to support their children's technology learning journey with practical tips and activity ideas.",
                            new BigDecimal("16.99"),
                            null,
                            null,
                            "New",
                            5.0,
                            67,
                            ProductCategory.PARENT_GUIDE,
                            false,
                            false,
                            true
                    ),
                    new Product(
                            "AI & Robotics Creative Kit",
                            "Hands-on creative kit with building blocks, sensors, and interactive components for learning robotics and AI concepts.",
                            new BigDecimal("34.99"),
                            new BigDecimal("39.99"),
                            null,
                            null,
                            5.0,
                            203,
                            ProductCategory.EDUCATIONAL_TOY,
                            false,
                            true,
                            false
                    )
            );

            products.forEach(product -> {
                product.setSeller(seller);
                seller.addProduct(product);
            });

            productRepository.saveAll(products);
        }
    }
}
