package com.example.Market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "productos")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProduct;

    @Column(name = "nombre")
    private String nameProduct;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoryEntity category;

    @OneToMany(mappedBy = "product")
    private List<BuyProductEntity> buyProduct;

    @Column(name = "codigo_barras")
    private String barCode;

    @Column(name = "precio_venta")
    private Double priceSale;

    @Column(name = "cantidad_stock")
    private Integer quantityStock;

    @Column(name = "estado")
    private Boolean statusProduct;


    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public List<BuyProductEntity> getBuyProduct() {
        return this.buyProduct;
    }

    public void setBuyProduct(List<BuyProductEntity> buyProduct) {
        this.buyProduct = buyProduct;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Double getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(Double priceSale) {
        this.priceSale = priceSale;
    }

    public Integer getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(Integer quantityStock) {
        this.quantityStock = quantityStock;
    }

    public Boolean getStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(Boolean statusProduct) {
        this.statusProduct = statusProduct;
    }




}
