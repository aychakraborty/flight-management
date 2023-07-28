package com.qatarairways.adapter.flight.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.qatarairways.adapter.flight.model.FlightAvailabilityRequest;
import com.qatarairways.adapter.flight.model.FlightSummary;
import com.qatarairways.adapter.flight.service.FlightAvailabilityService;

/**
 * 
 * This API is used to search for available flights as per user choices
 * 
 * @author Ayan_Chakraborty
 *
 */
@Controller
public class FlightController {
	
	@Autowired
	FlightAvailabilityService flightAvailabilityService;
	
	@GetMapping("/seachFlight")
	public ResponseEntity<Collection<FlightSummary>> getAvailableFlights(@RequestBody FlightAvailabilityRequest request) {
		return new ResponseEntity<Collection<FlightSummary>>(flightAvailabilityService.getAvailableFlights(request), HttpStatus.OK);
	}
	

}
