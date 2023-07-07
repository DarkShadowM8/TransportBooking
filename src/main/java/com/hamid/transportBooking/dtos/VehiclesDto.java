package com.hamid.transportBooking.dtos;

public record VehiclesDto(
		Long id,
		String company,
		String model,
		String vehicleNum,
		int seats,
		SupplierDto Supplier
		){

}
