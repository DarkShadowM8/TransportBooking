package com.hamid.transportBooking.adapters;

import com.hamid.transportBooking.dtos.VehiclesDto;
import com.hamid.transportBooking.entities.Vehicles;

public class VehiclesAdapter implements Adapter<VehiclesDto, Vehicles>{

	SupplierAdapter supplierAdapter = new SupplierAdapter();
	@Override
	public Vehicles dtoToDao(VehiclesDto dto) {
		Vehicles dao = new Vehicles();
		return updateToDao(dto, dao);
	}

	@Override
	public Vehicles updateToDao(VehiclesDto dto, Vehicles dao) {
		dao.setCompany(dto.company());
		dao.setModel(dto.model());
		dao.setVehicleNum(dto.vehicleNum());
		dao.setSeats(dto.seats());
		dao.setSupplier(supplierAdapter.dtoToDao(dto.Supplier()));
		return dao;
	}

	@Override
	public VehiclesDto daoToDto(Vehicles dao) {
		VehiclesDto dto = new VehiclesDto(
				dao.getId(),
				dao.getCompany(),
				dao.getModel(),
				dao.getVehicleNum(),
				dao.getSeats(),
				supplierAdapter.daoToDto(dao.getSupplier()));
		return dto;
	}

	
	
}
