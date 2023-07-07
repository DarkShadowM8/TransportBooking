package com.hamid.transportBooking.entities;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PickAndDrop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date date;
    private Time time;

    @OneToOne
    private Location location;
    
    @OneToOne(mappedBy = "pickUp")
    private Journey journeyPickUp;
    
    @OneToOne(mappedBy = "dropOff")
    private Journey journeyDropOff;

    // Constructors, getters, and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date dateField) {
        this.date = dateField;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time timeField) {
        this.time = timeField;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

	public Journey getJourneyPickUp() {
		return journeyPickUp;
	}

	public void setJourneyPickUp(Journey journeyPickUp) {
		this.journeyPickUp = journeyPickUp;
	}

	public Journey getJourneyDropOff() {
		return journeyDropOff;
	}

	public void setJourneyDropOff(Journey journeyDropOff) {
		this.journeyDropOff = journeyDropOff;
	}
    
    
}
