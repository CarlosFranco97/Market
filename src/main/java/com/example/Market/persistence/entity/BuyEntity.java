package com.example.Market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class BuyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idBuy;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private CustomerEntity customer;

    @Column(name = "fecha")
    private LocalDateTime date;

    @Column(name = "medio_pago")
    private String meansOfPayment;

    @Column(name = "comentario")
    private String comment;

    @Column(name = "estado")
    private Boolean statusBuy;

    @OneToMany(mappedBy = "buy")
    private List<BuyProductEntity> buyProduct;

    public Integer getIdBuy() {
        return idBuy;
    }

    public void setIdBuy(Integer idBuy) {
        this.idBuy = idBuy;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
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

    public Boolean getState() {
        return statusBuy;
    }

    public void setState(Boolean statusBuy) {
        this.statusBuy = statusBuy;
    }

    public Boolean getStatusBuy() {
        return statusBuy;
    }

    public void setStatusBuy(Boolean statusBuy) {
        this.statusBuy = statusBuy;
    }

    public List<BuyProductEntity> getBuyProducts() {
        return buyProduct;
    }

    public void setBuyProducts(List<BuyProductEntity> buyProduct) {
        this.buyProduct = buyProduct;
    }

    public List<BuyProductEntity> getBuyProduct() {
        return buyProduct;
    }

    public void setBuyProduct(List<BuyProductEntity> buyProduct) {
        this.buyProduct = buyProduct;
    }
}
