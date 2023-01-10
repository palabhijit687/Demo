package com.abhijit.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhijit.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
