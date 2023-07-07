package com.hamid.transportBooking.dtos;

public record JourneyDto(
		Long id,
		PickAndDropDto pickUp,
		PickAndDropDto dropOff,
		VehiclesDto vehilce,
		ClientDto client,
		int numOfPassengers
		) {

}
