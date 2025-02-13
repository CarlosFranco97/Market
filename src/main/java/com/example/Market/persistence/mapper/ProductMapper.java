package com.example.Market.persistence.mapper;

import com.example.Market.domain.Product;
import com.example.Market.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    Product toProduct(ProductEntity product);
    List<Product> toProducts(List<ProductEntity> product);

    @InheritInverseConfiguration
    @Mapping(target = "buyProduct", ignore = true)
    @Mapping(target = "barCode", ignore = true)
    @Mapping(target = "statusProduct", ignore = true)
    ProductEntity toProductEntity(Product product);

}
