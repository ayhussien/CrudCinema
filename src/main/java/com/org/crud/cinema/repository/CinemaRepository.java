package com.org.crud.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.crud.cinema.entity.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {

}
