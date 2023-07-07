package com.hamid.transportBooking.adapters;

public interface Adapter <DTO, DAO>{

	public DAO dtoToDao(DTO dto);
	public DAO updateToDao(DTO dto, DAO dao);
	public DTO daoToDto(DAO dao);
}
