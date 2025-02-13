package com.example.Market.persistence.entity;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "clientes")
public class CustomerEntity {

    @Id
    @Column(name = "id")
    private String idCustomer;

    @Column(name = "nombre")
    private String nameCustomer;

    @Column(name = "apellidos")
    private String lastName;

    @Column(name = "celular")
    private BigInteger phone;

    @Column(name = "direccion")
    private String addres;

    @Column(name = "correo_electronico")
    private String email;

    @OneToMany(mappedBy = "customer")
    private List<BuyEntity> buy;

    public String getIdCustomer(){
        return this.idCustomer;
    }

    public void setIdCustomer(String idCustomer){
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BuyEntity> getBuys() {
        return buy;
    }

    public void setBuys(List<BuyEntity> buy) {
        this.buy = buy;
    }

}
