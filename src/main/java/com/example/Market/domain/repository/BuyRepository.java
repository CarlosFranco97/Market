package com.example.Market.domain.repository;

import com.example.Market.domain.Buy;

import java.util.List;

public interface BuyRepository {
    List<Buy> getAll();
    List<Buy> getClient(String ClientId);
    Buy save(Buy buy);
}
