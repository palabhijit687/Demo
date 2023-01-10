package com.abhijit.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhijit.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
