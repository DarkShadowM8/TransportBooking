package com.hamid.transportBooking.dtos;

import java.sql.Date;
import java.sql.Time;

public record PickAndDropDto(
		Long id,
		Date date,
		Time time,
		LocationDto location
		) {

}
