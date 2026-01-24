package com.ecommerce.sportscenter.service;

import com.ecommerce.sportscenter.model.ProductResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    ProductResponse getProductById(Integer productId);
    Page<ProductResponse> getAllProducts();
}
