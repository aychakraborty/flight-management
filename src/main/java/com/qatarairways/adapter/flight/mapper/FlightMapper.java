package com.qatarairways.adapter.flight.mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.qatarairways.adapter.flight.model.FlightHub;
import com.qatarairways.adapter.flight.model.FlightSummary;

/**
 * 
 * This Mapper Class is used for mapping ResultSet Data with Actual Data Model
 * 
 * @author Ayan_Chakraborty
 *
 */
@Mapper
public interface FlightMapper {

	FlightMapper INSTANCE = Mappers.getMapper(FlightMapper.class);

	/**
	 * Maps Flight Hub to Flight Summary
	 * 
	 * @param flightHub
	 * @return
	 */
	@Named("mapToFlightSummary")
	FlightSummary flightHubToFlightSummary(FlightHub flightHub);

	/**
	 * Maps List of Flight Hub to List of Flight Summary
	 * 
	 * @param availableFlightList
	 * @return
	 */
	@IterableMapping(qualifiedByName = "mapToFlightSummary")
	List<FlightSummary> flightHubListToFlightSummaryList(List<FlightHub> availableFlightList);

}
