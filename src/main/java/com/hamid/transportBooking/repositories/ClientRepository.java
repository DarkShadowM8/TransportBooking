package com.hamid.transportBooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamid.transportBooking.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
