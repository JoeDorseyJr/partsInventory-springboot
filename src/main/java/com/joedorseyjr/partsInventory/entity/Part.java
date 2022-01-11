package com.joedorseyjr.partsInventory.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "part")
public class Part {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "part_title")
    private String partTitle;

    @Column(name = "part_serial_number")
    private String partSerialNumber;

    @Column(name = "part_price")
    private double partPrice;

    @Column(name = "quantity")
    private short quantity;

//CONSTRUCTORS
    public Part() {}
    public Part(String partTitle,String partSerialNumber,double partPrice,short quantity){
        this.partTitle = partTitle;
        this.partSerialNumber = partSerialNumber;
        this.partPrice = partPrice;
        this.quantity = quantity;
    }
//GETTERS AND SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getPartTitle(){
        return partTitle;
    }
    public void setPartTitle(String partTitle){
        this.partTitle = partTitle;
    }

    public String getPartSerialNumber(){
        return partSerialNumber;
    }
    public void setPartSerialNumber(String partSerialNumber){
        this.partSerialNumber = partSerialNumber;
    }

    public double getPartPrice(){
        return partPrice;
    }
    public void setPartPrice(double partPrice){
        this.partPrice = partPrice;
    }

    public short getQuantity(){
        return quantity;
    }
    public void setQuantity(short quantity){
        this.quantity = quantity;
    }
}
