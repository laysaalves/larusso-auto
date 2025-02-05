package dev.layseiras.larussoauto.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_car")
public class Car extends Generic {

    @Column(name="name", nullable=false, length=100)
    private String name;

    @Column(name="brand", nullable=false)
    private String brand;

    @Column(name="model", nullable=false, length=100)
    private String model;

    @Column(name="version", nullable=false)
    private String version;

    @Column(name="produced_quantity", nullable=false)
    private int producedQuantity;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id", nullable = false, referencedColumnName = "id")
    private Seller seller;

    public Car() {
        super();
    }

    public Car(String name, String brand, String model, String version, int producedQuantity) {
        super();
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.version = version;
        this.producedQuantity = producedQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getProducedQuantity() {
        return producedQuantity;
    }

    public void setProducedQuantity(int producedQuantity) {
        this.producedQuantity = producedQuantity;
    }
}