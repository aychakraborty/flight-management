package com.qatarairways.adapter.flight.enums;

/**
 * 
 * This ENUM deals with User's Sort Preference Choice
 * 
 * @author Ayan_Chakraborty
 *
 */
public enum SortPreferenceEnum {

	FLIGHT_LENGTH("flightLength"), AVG_PRICE("priceInUsd"), NONE("none");

	public final String sortPreference;

	private SortPreferenceEnum(String sortPreference) {
		this.sortPreference = sortPreference;
	}

}
