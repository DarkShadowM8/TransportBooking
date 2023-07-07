package com.hamid.transportBooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamid.transportBooking.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{

}
