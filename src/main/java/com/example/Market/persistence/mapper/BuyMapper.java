package com.example.Market.persistence.mapper;

import com.example.Market.domain.Buy;
import com.example.Market.persistence.entity.BuyEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BuyMapper {
    @Mapping(source = "customer", target = "clientId")
    @Mapping(source = "statusBuy", target = "status")
    @Mapping(source = "buyProduct", target = "product")
    Buy toBuy(BuyEntity buy);
    List<Buy> toBuys(List<BuyEntity> buy);

    @InheritInverseConfiguration
    BuyEntity toBuyEntity(Buy buy);
}
