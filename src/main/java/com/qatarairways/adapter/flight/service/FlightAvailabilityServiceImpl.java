package com.qatarairways.adapter.flight.service;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qatarairways.adapter.flight.enums.CancellationPreferenceEnum;
import com.qatarairways.adapter.flight.mapper.FlightMapper;
import com.qatarairways.adapter.flight.model.FlightAvailabilityRequest;
import com.qatarairways.adapter.flight.model.FlightHub;
import com.qatarairways.adapter.flight.model.FlightSummary;
import com.qatarairways.adapter.flight.model.repository.FlightAvailabilityRepository;

/**
 * 
 * This is the implementation class of FlightAvailabilityService
 * 
 * @author Ayan_Chakraborty
 *
 */
@Service
public class FlightAvailabilityServiceImpl implements FlightAvailabilityService {
	
	@Autowired
	FlightAvailabilityRepository flightRepo;
	
	@Autowired
	FlightMapper flightMapper;

	@Override
	public Collection<FlightSummary> getAvailableFlights(FlightAvailabilityRequest request) {
		List<FlightHub> availableFlightList = flightRepo.listOfFlights(request);	// Fetch Flights from DB
		List<FlightSummary> flightSummary = flightMapper.flightHubListToFlightSummaryList(availableFlightList);	// Map to Display Object
		// Plan Display Object based on User Filter Criteria
		if(Objects.nonNull(request.getFilterCriteria()) && Objects.nonNull(request.getFilterCriteria().getDisplayLimit())) {
			if(CancellationPreferenceEnum.BOTH.equals(request.getFilterCriteria().getCancelPreference())) {	// Both Cancellable and Non-Cancellable Flights
				flightSummary.stream().limit(request.getFilterCriteria().getDisplayLimit()).collect(Collectors.toList());
			} else if(CancellationPreferenceEnum.YES.equals(request.getFilterCriteria().getCancelPreference())) {	// Cancellable Flight Choices
				flightSummary.stream().filter(flight -> flight.isCancellationPossible()).limit(request.getFilterCriteria().getDisplayLimit()).collect(Collectors.toList());
			} else if(CancellationPreferenceEnum.NO.equals(request.getFilterCriteria().getCancelPreference())) {	// Non-Cancellable Flight Choices
				flightSummary.stream().filter(flight -> !flight.isCancellationPossible()).limit(request.getFilterCriteria().getDisplayLimit()).collect(Collectors.toList());
			}
		} else {
			return flightSummary.stream().limit(3).collect(Collectors.toList());	// No filter Option
		}
		return flightSummary;
	}

}
