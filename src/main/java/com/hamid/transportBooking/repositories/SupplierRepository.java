package com.hamid.transportBooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamid.transportBooking.entities.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
