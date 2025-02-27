package com.example.Market.domain;


import java.time.LocalDateTime;
import java.util.List;

public class Buy {
    private Integer idBuy;
    private String clientId;
    private LocalDateTime date;
    private String meansOfPayment;
    private String comment;
    private Boolean status;
    private List<BuyProduct> product;

    public Integer getIdBuy() {
        return idBuy;
    }

    public void setIdBuy(Integer idBuy) {
        this.idBuy = idBuy;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getMeansOfPayment() {
        return meansOfPayment;
    }

    public void setMeansOfPayment(String meansOfPayment) {
        this.meansOfPayment = meansOfPayment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<BuyProduct> getProduct() {
        return product;
    }

    public void setProduct(List<BuyProduct> product) {
        this.product = product;
    }
}
