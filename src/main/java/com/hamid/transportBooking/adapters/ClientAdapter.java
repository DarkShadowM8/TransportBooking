package com.hamid.transportBooking.adapters;

import com.hamid.transportBooking.dtos.ClientDto;
import com.hamid.transportBooking.entities.Client;

public class ClientAdapter implements Adapter<ClientDto, Client> {

	@Override
	public Client dtoToDao(ClientDto dto) {
		Client dao = new Client();
		return updateToDao(dto, dao);
	}

	@Override
	public Client updateToDao(ClientDto dto, Client dao) {
		dao.setName(dto.name());
		dao.setEmail(dto.email());
		dao.setPhoneNumber(dto.phoneNumber());
		dao.setGender(dto.gender());
		return dao;
	}

	@Override
	public ClientDto daoToDto(Client dao) {
		ClientDto dto = new ClientDto(
				dao.getId(),
				dao.getName(),
				dao.getEmail(),
				dao.getPhoneNumber(),
				dao.getGender());
		return dto;
	}

}
