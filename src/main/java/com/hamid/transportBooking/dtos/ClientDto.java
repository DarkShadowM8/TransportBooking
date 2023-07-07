package com.hamid.transportBooking.dtos;

import com.hamid.transportBooking.enums.Gender;

public record ClientDto(
		Long id,
		String name,
		String email,
		int phoneNumber,
		Gender gender
		) {

}
