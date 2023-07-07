package com.hamid.transportBooking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String state;
    private String city;
    private String street;

    @OneToOne(mappedBy = "location")
    private PickAndDrop pickupAndDrop;

    // Constructors, getters, and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public PickAndDrop getPickupAndDrop() {
        return pickupAndDrop;
    }

    public void setPickupAndDrop(PickAndDrop pickupAndDrop) {
        this.pickupAndDrop = pickupAndDrop;
    }
}
