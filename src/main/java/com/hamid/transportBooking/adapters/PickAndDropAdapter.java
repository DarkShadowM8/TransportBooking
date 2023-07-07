package com.hamid.transportBooking.adapters;

import com.hamid.transportBooking.dtos.PickAndDropDto;
import com.hamid.transportBooking.entities.PickAndDrop;

public class PickAndDropAdapter implements Adapter<PickAndDropDto, PickAndDrop>{
	
	LocationAdapter locationAdapter = new LocationAdapter();

	public PickAndDrop dtoToDao(PickAndDropDto dto) {
		
		PickAndDrop dao = new PickAndDrop();
		
		return updateToDao(dto, dao);
	}

	public PickAndDrop updateToDao(PickAndDropDto dto, PickAndDrop dao) {
		
		dao.setDate(dto.date());
		dao.setTime(dto.time());
		dao.setLocation(
				locationAdapter.dtoToDao(dto.location()));
		
		return dao;
	}
	
	public PickAndDropDto daoToDto(PickAndDrop dao) {
		
		
		PickAndDropDto dto = new PickAndDropDto(
				dao.getId(),
				dao.getDate(),
				dao.getTime(),
				locationAdapter.daoToDto(dao.getLocation()));
		
		return dto;
	}
}
