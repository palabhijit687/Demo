package com.abhijit.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhijit.flightreservation.entities.Reservation;

public interface PassengerRepository extends JpaRepository<Reservation, Long> {

}
