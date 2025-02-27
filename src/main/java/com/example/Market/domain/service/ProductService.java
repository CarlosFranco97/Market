package com.example.Market.domain.service;

import com.example.Market.domain.Product;
import com.example.Market.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAlLProducts(){
        return productRepository.getAllProducts();
    }

    public List<Product> getByCategory(Integer idCategory){
        return productRepository.getByCategory(idCategory);
    }

    public List<Product> getScarseProduct(Integer quantityStock, Boolean status){
        return productRepository.getScarseProducts(quantityStock, true);
    }

    public Optional<Product> getByNameProduct(String nameProduct){
        return productRepository.getByNameProduct(nameProduct);
    }

    public Optional<Product> getById(Integer id){
        return productRepository.getByIdProduct(id);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public boolean delete(Integer idProduct){
        return productRepository.deleteForId(idProduct);
    }

}
