package com.example.Market.domain.repository;


import com.example.Market.domain.Product;
import com.example.Market.persistence.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAllProducts();
    List<Product> getByCategory(Integer idCategory);
    List<Product> getScarseProducts(Integer quantityStock, Boolean status);
    Optional<Product> getByNameProduct(String nameProduct);
    Optional<Product> getById(Integer id);
    Product save(Product product);
    void deleteForId(Integer idProduct);
}
