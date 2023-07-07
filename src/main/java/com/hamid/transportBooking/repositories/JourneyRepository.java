package com.hamid.transportBooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamid.transportBooking.entities.Journey;

public interface JourneyRepository extends JpaRepository<Journey, Long>{

}
