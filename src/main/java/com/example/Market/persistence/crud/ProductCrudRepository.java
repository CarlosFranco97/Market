package com.example.Market.persistence.crud;

import com.example.Market.persistence.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer> {

    List<ProductEntity> findAllBy();
    List<ProductEntity> findByCategoryIdCategory(Integer categoryId);
    List<ProductEntity> findByQuantityStockLessThanAndStatusProduct(Integer quantityStock, Boolean status);
    Optional<ProductEntity> findByNameProduct(String nameProduct);
    Optional<ProductEntity> findById(Integer idProduct);
    void deleteById(Integer idProduct);
}
