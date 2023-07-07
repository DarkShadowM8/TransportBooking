package com.hamid.transportBooking.adapters;

import com.hamid.transportBooking.dtos.LocationDto;
import com.hamid.transportBooking.entities.Location;

public class LocationAdapter implements Adapter<LocationDto, Location>{

	
	public Location dtoToDao(LocationDto dto) {
		Location dao = new Location();
		
		return updateToDao(dto, dao);
	}

	public Location updateToDao(LocationDto dto, Location dao) {
		
		dao.setState(dto.state());
		dao.setCity(dto.city());
		dao.setStreet(dto.street());
		
		return dao;
	}
	
	public LocationDto daoToDto(Location dao) {
		
		LocationDto dto = new LocationDto(
				dao.getId(),
				dao.getState(),
				dao.getCity(),
				dao.getStreet());
		
		return dto;
	}
}
