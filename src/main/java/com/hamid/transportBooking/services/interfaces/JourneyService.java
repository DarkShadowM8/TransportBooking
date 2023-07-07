package com.hamid.transportBooking.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hamid.transportBooking.dtos.JourneyDto;

@Service
public interface JourneyService {

	public String addJourney(JourneyDto dto);
	public List<JourneyDto> getAll();
	public JourneyDto getById(Long id);
	public String deleteById(Long id);
	public String deleteAllJourneys();
	public JourneyDto update(JourneyDto dto);
}
