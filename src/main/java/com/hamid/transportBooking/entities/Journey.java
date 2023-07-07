package com.hamid.transportBooking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Journey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private PickAndDrop pickUp;

    @OneToOne
    private PickAndDrop dropOff;

    @OneToOne
    private Vehicles vehicle;
    
    @OneToOne
    private Client client;

    private int numOfPassengers;

    // Constructors, getters, and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PickAndDrop getPickUp() {
        return pickUp;
    }

    public void setPickUp(PickAndDrop pickUp) {
        this.pickUp = pickUp;
    }

    public PickAndDrop getDropOff() {
        return dropOff;
    }

    public void setDropOff(PickAndDrop dropOff) {
        this.dropOff = dropOff;
    }

    public Vehicles getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicles vehicle) {
        this.vehicle = vehicle;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
    
    
}
