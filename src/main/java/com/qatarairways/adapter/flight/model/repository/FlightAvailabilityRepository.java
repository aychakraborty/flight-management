package com.qatarairways.adapter.flight.model.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Repository;

import com.qatarairways.adapter.flight.enums.SortPreferenceEnum;
import com.qatarairways.adapter.flight.model.FlightAvailabilityRequest;
import com.qatarairways.adapter.flight.model.FlightHub;

/**
 * 
 * This creates JDBC connection and used as Flight Repository for DAO calls.
 * 
 * @author Ayan_Chakraborty
 *
 */
@Repository
public class FlightAvailabilityRepository {

	private Connection conn;

	/**
	 * Configure JDBC connection to postgresql
	 */
	private FlightAvailabilityRepository() {
		try {
			conn = DriverManager
					.getConnection("jdbc:postgresql://localhost:9090/testdb?user=test&password=test&ssl=true");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Returns a list of flights from the table flightDB
	 * 
	 * @param request
	 * @return
	 */
	public List<FlightHub> listOfFlights(FlightAvailabilityRequest request) {
		List<FlightHub> flightList = new ArrayList<>();
		try {
			String sql = "select * from FlightDB where origin = ? and destination = ? and departureTime = ? and seatsAvailable >= ?";
			PreparedStatement ps = this.conn.prepareStatement(sql);

			ps.setString(1, request.getOrigin());
			ps.setString(2, request.getDestination());
			ps.setDate(3, new java.sql.Date(request.getDepartureDate().getTime()));
			ps.setInt(4, request.getNumberOfTravellers());

			// Below are addition to prepared statement based on filter criteria

			if (Objects.nonNull(request.getFilterCriteria())) {
				if (Objects.nonNull(request.getFilterCriteria().getMaxPrice())) {
					sql += " and averagePriceInUsd <= ?";
					ps.setFloat(5, request.getFilterCriteria().getMaxPrice());
				}

				if (SortPreferenceEnum.FLIGHT_LENGTH.name()
						.equals(request.getFilterCriteria().getSortPreference().name())) {
					sql += " order by flightLength";
				} else if (SortPreferenceEnum.AVG_PRICE.name()
						.equals(request.getFilterCriteria().getSortPreference().name())) {
					sql += " order by averagePriceInUsd";
				}
			}

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				FlightHub flightHub = new FlightHub();
				flightHub.setAirlineCode(rs.getString("airlineCode"));
				flightHub.setOrigin(rs.getString("origin"));
				flightHub.setDestination(rs.getString("destination"));
				flightHub.setDepartureTime(new java.util.Date(rs.getDate("departureTime").getTime()));
				flightHub.setArrivalTime(new java.util.Date(rs.getDate("arrivalTime").getTime()));
				flightHub.setAveragePriceInUsd(rs.getFloat("averagePriceInUsd"));
				flightHub.setFlightLength(rs.getFloat("flightLength"));
				flightHub.setSeatsAvailable(rs.getInt("seatsAvailable"));
				flightHub.setIsCancellationAllowed(rs.getBoolean("isCancellationAllowed"));
				flightList.add(flightHub);
			}

			ps.close();

			return flightList;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
