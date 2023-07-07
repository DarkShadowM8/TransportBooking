package com.hamid.transportBooking.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.hamid.transportBooking.adapters.JourneyAdapter;
import com.hamid.transportBooking.dtos.JourneyDto;
import com.hamid.transportBooking.entities.Journey;
import com.hamid.transportBooking.repositories.ClientRepository;
import com.hamid.transportBooking.repositories.JourneyRepository;
import com.hamid.transportBooking.repositories.LocationRepository;
import com.hamid.transportBooking.repositories.PickAndDropRepository;
import com.hamid.transportBooking.repositories.VehiclesRepositories;
import com.hamid.transportBooking.services.interfaces.JourneyService;

import jakarta.persistence.EntityNotFoundException;

public class JouneryServiceImpl implements JourneyService {
	
	//repositories
	JourneyRepository journeyRepo;
	LocationRepository locationRepo;
	PickAndDropRepository pickRepo;
	VehiclesRepositories vehicleRepo;
	ClientRepository clientRepo;
	
	//adapters
	JourneyAdapter journeyAdapter = new JourneyAdapter();
	
	public JouneryServiceImpl(JourneyRepository journeyRepo,
			PickAndDropRepository pickRepo,
			VehiclesRepositories vehicleRepo,
			ClientRepository clientRepo,
			LocationRepository locationRepo) {
		
		this.journeyRepo = journeyRepo;
		this.locationRepo = locationRepo;
		this.pickRepo = pickRepo;
		this.vehicleRepo = vehicleRepo;
		this.clientRepo = clientRepo;
	}

	@Override
	public String addJourney(JourneyDto dto) {
		try {
			Journey journeyDao = journeyAdapter.dtoToDao(dto);
			
			locationRepo.save(journeyDao.getPickUp().getLocation());
			locationRepo.save(journeyDao.getDropOff().getLocation());
			pickRepo.save(journeyDao.getPickUp());
			pickRepo.save(journeyDao.getDropOff());
			vehicleRepo.save(journeyDao.getVehicle());
			clientRepo.save(journeyDao.getClient());
			
			journeyRepo.save(journeyDao);
			
			return "Journey added Successfully!!!";
		}
		catch (Exception e) {
			return "This Journey cann't be added because " + e;
		}
	}

	@Override
	public List<JourneyDto> getAll() {
		List<Journey> list = journeyRepo.findAll();
		
		List<JourneyDto> listDto = new ArrayList<>();
		
		for (Journey journey : list) {
			listDto.add(journeyAdapter.daoToDto(journey));
		}
		
		return listDto;
	}

	@Override
	public JourneyDto getById(Long id) {
		Journey journey = journeyRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Journey not found with ID: " + id));
		JourneyDto dto = journeyAdapter.daoToDto(journey);
		
		return dto;
	}

	@Override
	public String deleteById(Long id) {
		Journey journey = journeyRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Journey not found with ID: " + id));
		journeyRepo.delete(journey);
		return "Journey deleted successfully!!!";
	}

	@Override
	public String deleteAllJourneys() {
		journeyRepo.deleteAll();
		return "deleted successfully!!!";
	}

	@Override
	public JourneyDto update(JourneyDto dto) {
		Long id = dto.id();
		Journey journey = journeyRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Journey not found with id " + id));
		
		journeyAdapter.updateToDao(dto, journey);
		dto = journeyAdapter.daoToDto(journey);
		return dto;
	}

}
