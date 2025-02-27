package com.example.Market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "compras_productos")
public class BuyProductEntity {

    @EmbeddedId
    private BuyProductEntityPK idBuyProducts;

    @ManyToOne
    @MapsId("idBuy")
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private BuyEntity buy;

    @ManyToOne
    @MapsId("idProduct")
    @JoinColumn(name = "id_producto")
    private ProductEntity product;

    @Column(name = "cantidad")
    private Integer quantityBuyProducts;

    @Column(name = "total")
    private Integer total;

    @Column(name = "estado")
    private Boolean statusBuyProduct;


    public BuyProductEntityPK getIdBuyProducts() {
        return idBuyProducts;
    }

    public void setIdBuyProducts(BuyProductEntityPK idBuyProducts) {
        this.idBuyProducts = idBuyProducts;
    }

    public Integer getQuantityBuyProducts() {
        return quantityBuyProducts;
    }

    public void setQuantityBuyProducts(Integer quantityBuyProducts) {
        this.quantityBuyProducts = quantityBuyProducts;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getStatusBuyProduct() {
        return statusBuyProduct;
    }

    public void setStatusBuyProduct(Boolean statusBuyProduct) {
        this.statusBuyProduct = statusBuyProduct;
    }

    public BuyEntity getBuy() {
        return buy;
    }

    public void setBuy(BuyEntity buy) {
        this.buy = buy;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }


}
