package com.qatarairways.adapter.flight.model;

import com.qatarairways.adapter.flight.enums.CancellationPreferenceEnum;
import com.qatarairways.adapter.flight.enums.SortPreferenceEnum;

/**
 * 
 * This data model represents User's Filter Criteria
 * 
 * @author Ayan_Chakraborty
 *
 */
public class FlightFilterCriteria {

	private CancellationPreferenceEnum cancelPreference;

	private Float maxPrice;

	private SortPreferenceEnum sortPreference;

	private Integer displayLimit;

	/**
	 * @return the cancelPreference
	 */
	public CancellationPreferenceEnum getCancelPreference() {
		return cancelPreference;
	}

	/**
	 * @param cancelPreference the cancelPreference to set
	 */
	public void setCancelPreference(CancellationPreferenceEnum cancelPreference) {
		this.cancelPreference = cancelPreference;
	}

	/**
	 * @return the maxPrice
	 */
	public Float getMaxPrice() {
		return maxPrice;
	}

	/**
	 * @param maxPrice the maxPrice to set
	 */
	public void setMaxPrice(Float maxPrice) {
		this.maxPrice = maxPrice;
	}

	/**
	 * @return the sortPreference
	 */
	public SortPreferenceEnum getSortPreference() {
		return sortPreference;
	}

	/**
	 * @param sortPreference the sortPreference to set
	 */
	public void setSortPreference(SortPreferenceEnum sortPreference) {
		this.sortPreference = sortPreference;
	}

	/**
	 * @return the displayLimit
	 */
	public Integer getDisplayLimit() {
		return displayLimit;
	}

	/**
	 * @param displayLimit the displayLimit to set
	 */
	public void setDisplayLimit(Integer displayLimit) {
		this.displayLimit = displayLimit;
	}

}
