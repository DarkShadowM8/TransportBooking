package com.hamid.transportBooking.adapters;

import com.hamid.transportBooking.dtos.JourneyDto;
import com.hamid.transportBooking.entities.Journey;

public class JourneyAdapter implements Adapter<JourneyDto, Journey> {

	PickAndDropAdapter pickAndDropAdapter = new PickAndDropAdapter();
	VehiclesAdapter vehicleAdapter = new VehiclesAdapter();
	ClientAdapter clientAdapter = new ClientAdapter();
	
	@Override
	public Journey dtoToDao(JourneyDto dto) {
		Journey dao = new Journey();
		return updateToDao(dto, dao);
	}

	@Override
	public Journey updateToDao(JourneyDto dto, Journey dao) {
		dao.setPickUp(pickAndDropAdapter.dtoToDao(dto.pickUp()));
		dao.setDropOff(pickAndDropAdapter.dtoToDao(dto.dropOff()));
		dao.setVehicle(vehicleAdapter.dtoToDao(dto.vehilce()));
		dao.setClient(clientAdapter.dtoToDao(dto.client()));
		dao.setNumOfPassengers(dto.numOfPassengers());
		return dao;
	}

	@Override
	public JourneyDto daoToDto(Journey dao) {
		JourneyDto dto = new JourneyDto(
				dao.getId(),
				pickAndDropAdapter.daoToDto(dao.getPickUp()),
				pickAndDropAdapter.daoToDto(dao.getDropOff()),
				vehicleAdapter.daoToDto(dao.getVehicle()),
				clientAdapter.daoToDto(dao.getClient()),
				dao.getNumOfPassengers());
		return dto;
	}

}
