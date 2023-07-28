package com.qatarairways.adapter.flight.model;

import java.util.Date;

import lombok.NonNull;

/**
 * Provides summary of a specific flight.
 */

public class FlightSummary {
	
	/**
	 * The airline code.
	 */
	@NonNull
	private String airlineCode;
	
	/**
	 * The departure datetime of the flight.
	 */
	@NonNull
	private Date departureTime;
	
	/**
	 * The expected arrival datetime of the flight.
	 */
	@NonNull
	private Date arrivalTime;
	
	/**
	 * The average price of the seats on this flight.
	 */
	private float averagePriceInUsd;
	
	/**
	 * Whether cancellation is possible for this flight.
	 */
	private boolean cancellationPossible;

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
	 * @return the departureTime
	 */
	public Date getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return the arrivalTime
	 */
	public Date getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return the averagePriceInUsd
	 */
	public float getAveragePriceInUsd() {
		return averagePriceInUsd;
	}

	/**
	 * @param averagePriceInUsd the averagePriceInUsd to set
	 */
	public void setAveragePriceInUsd(float averagePriceInUsd) {
		this.averagePriceInUsd = averagePriceInUsd;
	}

	/**
	 * @return the cancellationPossible
	 */
	public boolean isCancellationPossible() {
		return cancellationPossible;
	}

	/**
	 * @param cancellationPossible the cancellationPossible to set
	 */
	public void setCancellationPossible(boolean cancellationPossible) {
		this.cancellationPossible = cancellationPossible;
	}

}
