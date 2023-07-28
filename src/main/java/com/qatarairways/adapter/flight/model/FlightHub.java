package com.qatarairways.adapter.flight.model;

import java.util.Date;

import lombok.NonNull;

/**
 * 
 * This data model represents Result-set data after query to Flight DB
 * 
 * @author Ayan_Chakraborty
 *
 */
/**
 * @author Ayan_Chakraborty
 *
 */
public class FlightHub {

	/**
	 * The unique Flight Number
	 */
	@NonNull
	private String airlineCode;

	/**
	 * Country/City of origin
	 */
	@NonNull
	private String origin;

	/**
	 * Country/City of destination
	 */
	@NonNull
	private String destination;

	/**
	 * Date and Time of Departure
	 */
	@NonNull
	private Date departureTime;

	/**
	 * Date and Time of Arrival
	 */
	@NonNull
	private Date arrivalTime;

	/**
	 * Flight Prices in USD
	 */
	@NonNull
	private Float averagePriceInUsd;

	/**
	 * Flight Time between Source and Destination
	 */
	@NonNull
	private Float flightLength;

	/**
	 * Number of Seats Available
	 */
	@NonNull
	private Integer seatsAvailable;

	/**
	 * Cancellation Preference
	 */
	@NonNull
	private Boolean isCancellationAllowed;

	/**
	 * @return the airlineCode
	 */
	public String getAirlineCode() {
		return airlineCode;
	}

	/**
	 * @param airlineCode the airlineCode to set
	 */
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the departureDateTime
	 */
	public Date getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureDateTime the departureDateTime to set
	 */
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return the arrivalDateTime
	 */
	public Date getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @param arrivalDateTime the arrivalDateTime to set
	 */
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return the averagePriceInUsd
	 */
	public Float getAveragePriceInUsd() {
		return averagePriceInUsd;
	}

	/**
	 * @param averagePriceInUsd the averagePriceInUsd to set
	 */
	public void setAveragePriceInUsd(Float averagePriceInUsd) {
		this.averagePriceInUsd = averagePriceInUsd;
	}

	/**
	 * @return the flightLength
	 */
	public Float getFlightLength() {
		return flightLength;
	}

	/**
	 * @param flightLength the flightLength to set
	 */
	public void setFlightLength(Float flightLength) {
		this.flightLength = flightLength;
	}

	/**
	 * @return the seatsAvailable
	 */
	public Integer getSeatsAvailable() {
		return seatsAvailable;
	}

	/**
	 * @param seatsAvailable the seatsAvailable to set
	 */
	public void setSeatsAvailable(Integer seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	/**
	 * @return the isCancellationAllowed
	 */
	public Boolean getIsCancellationAllowed() {
		return isCancellationAllowed;
	}

	/**
	 * @param isCancellationAllowed the isCancellationAllowed to set
	 */
	public void setIsCancellationAllowed(Boolean isCancellationAllowed) {
		this.isCancellationAllowed = isCancellationAllowed;
	}

}