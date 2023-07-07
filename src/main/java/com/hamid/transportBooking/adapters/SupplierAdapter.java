package com.hamid.transportBooking.adapters;

import com.hamid.transportBooking.dtos.SupplierDto;
import com.hamid.transportBooking.entities.Supplier;

public class SupplierAdapter implements Adapter<SupplierDto, Supplier>{

	public Supplier dtoToDao(SupplierDto dto) {
		
		Supplier dao = new Supplier();
		
		return updateToDao(dto, dao);
	}

	@Override
	public Supplier updateToDao(SupplierDto dto, Supplier dao) {
		
		dao.setFirstName(dto.firstName());
		dao.setLastName(dto.LastName());
		dao.setAddress(dto.address());
		dao.setEmail(dto.email());
		
		return dao;
	}

	@Override
	public SupplierDto daoToDto(Supplier dao) {
		
		SupplierDto dto = new SupplierDto(
				dao.getId(),
				dao.getFirstName(),
				dao.getLastName(),
				dao.getAddress(),
				dao.getEmail());
		return null;
	}
}
