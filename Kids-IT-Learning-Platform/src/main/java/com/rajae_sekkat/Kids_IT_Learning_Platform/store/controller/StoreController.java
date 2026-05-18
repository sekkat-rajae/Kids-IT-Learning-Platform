package com.rajae_sekkat.Kids_IT_Learning_Platform.store.controller;

import com.rajae_sekkat.Kids_IT_Learning_Platform.store.dto.ProductDto;
import com.rajae_sekkat.Kids_IT_Learning_Platform.store.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/store")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/products")
    public List<ProductDto> getProducts() {
        return storeService.findAllProducts();
    }
}
