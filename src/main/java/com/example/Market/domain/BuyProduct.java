package com.example.Market.domain;

public class BuyProduct {
    private Integer idBuyProduct;
    private Integer quantity;
    private Integer total;
    private Boolean active;

    public Integer getIdBuyProduct() {
        return idBuyProduct;
    }

    public void setIdBuyProduct(Integer idBuyProduct) {
        this.idBuyProduct = idBuyProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
