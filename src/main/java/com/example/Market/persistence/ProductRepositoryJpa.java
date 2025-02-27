package com.example.Market.persistence;


import com.example.Market.domain.Product;
import com.example.Market.domain.repository.ProductRepository;
import com.example.Market.persistence.crud.ProductCrudRepository;
import com.example.Market.persistence.entity.ProductEntity;
import com.example.Market.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryJpa implements ProductRepository {

    @Autowired
    private ProductCrudRepository productCrudRepository;

    @Autowired
    private ProductMapper mapper;

    /* debe de retornar el product */
    public List<Product> getAllProducts(){
        List<ProductEntity> products = productCrudRepository.findAllBy();
        return mapper.toProducts(products);
    }

    public List<Product> getByCategory(Integer idCategory){
        List<ProductEntity> products = productCrudRepository.findByCategoryIdCategory(idCategory);
        return mapper.toProducts(products);
    }

    public List<Product> getScarseProducts(Integer quantityStock, Boolean status){
       List<ProductEntity> products = productCrudRepository.findByQuantityStockLessThanAndStatusProduct(quantityStock, true);
        return mapper.toProducts(products);
    }

    public Optional<Product> getByNameProduct(String nameProduct){
        Optional<ProductEntity> productByName = productCrudRepository.findByNameProduct(nameProduct);
        return productByName.map(product -> mapper.toProduct(product));
    }

    public Optional<Product> getByIdProduct(Integer idProduct){
        Optional<ProductEntity> productById =  productCrudRepository.findById(idProduct);
        return productById.map(product -> mapper.toProduct(product));
    }

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = mapper.toProductEntity(product);
        return mapper.toProduct(productCrudRepository.save(productEntity));
    }

    @Override
    public boolean deleteForId(Integer idProduct) {
        if(!productCrudRepository.existsById(idProduct)){
            throw new RuntimeException("Producto no encontrado con el ID: " + idProduct);
        }

        productCrudRepository.deleteById(idProduct);
        return true;


    }

}
