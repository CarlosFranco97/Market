package com.example.Market.domain.service;

import com.example.Market.domain.Product;
import com.example.Market.persistence.ProductRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepositoryJpa productRepositoryJpa;

    public List<Product> getAlLProducts(){
        return productRepositoryJpa.getAllProducts();
    }

    public List<Product> getByCategory(Integer idCategory){
        return productRepositoryJpa.getByCategory(idCategory);
    }

    public List<Product> getScarseProduct(Integer quantityStock, Boolean status){
        return productRepositoryJpa.getScarseProducts(quantityStock, true);
    }

    public Optional<Product> getByNameProduct(String nameProduct){
        return productRepositoryJpa.getByNameProduct(nameProduct);
    }

    public Optional<Product> getById(Integer id){
        return productRepositoryJpa.getById(id);
    }

    public Product save(Product product){
        return productRepositoryJpa.save(product);
    }

    public void delete(Integer idProduct){
        productRepositoryJpa.deleteForId(idProduct);
    }

}
