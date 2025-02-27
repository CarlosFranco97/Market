package com.example.Market.persistence.mapper;

import com.example.Market.domain.BuyProduct;
import com.example.Market.persistence.entity.BuyEntity;
import com.example.Market.persistence.entity.BuyProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface BuyProductMapper {

    @Mapping(source = "idBuyProducts.idProduct", target = "idBuyProduct")
    @Mapping(source = "quantityBuyProducts", target = "quantity")
    @Mapping(source = "statusBuyProduct", target = "active")
    BuyProduct toBuyProduct(BuyProductEntity buyProduct);
    List<BuyProduct> toBuyProducts(List<BuyProductEntity> buyProduct);

    @InheritInverseConfiguration
    @Mapping(target = "product", ignore = true)
    @Mapping(target = "buy", ignore = true)
    @Mapping(target = "idBuyProducts.idBuy", ignore = true)
    BuyProductEntity toBuyProductEntity(BuyEntity buy);
}
