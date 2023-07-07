package com.hamid.transportBooking.dtos;

import java.util.List;

public record SupplierDto(
		Long id,
		String firstName,
		String LastName,
		String address,
		String email
		){

}
