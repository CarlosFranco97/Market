package com.example.Market.persistence.entity;


import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class BuyProductEntityPK implements Serializable {

    private Integer idBuy;

    private Integer idProduct;

    public Integer getIdBuy() {
        return idBuy;
    }

    public void setIdBuy(Integer idBuy) {
        this.idBuy = idBuy;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }
}
