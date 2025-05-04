package org.example.tp3.product;

public interface ProductApiClient {
    Product getProduct(String productId) throws ProductApiException;
}