package com.qatarairways.adapter.flight.model;

import java.util.Date;

import lombok.NonNull;

/**
 * Represents a flight availability request.
 */
public class FlightAvailabilityRequest {

	/**
	 * The origin (departure) of the flights.
	 */
	@NonNull
	private String origin;

	/**
	 * The target destination of the flights.
	 */
	@NonNull
	private String destination;

	/**
	 * The day of departure.
	 */
	@NonNull
	private Date departureDate;

	/**
	 * The required number of seats.
	 */
	private int numberOfTravellers;

	/**
	 * The user filter criteria. Can be null if no filter criteria is chosen.
	 */
	private FlightFilterCriteria filterCriteria;

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @return the departureDate
	 */
	public Date getDepartureDate() {
		return departureDate;
	}

	/**
	 * @return the numberOfTravellers
	 */
	public int getNumberOfTravellers() {
		return numberOfTravellers;
	}

	/**
	 * @return the filterCriteria
	 */
	public FlightFilterCriteria getFilterCriteria() {
		return filterCriteria;
	}

}
