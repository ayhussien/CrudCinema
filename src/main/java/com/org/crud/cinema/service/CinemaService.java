package com.org.crud.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.crud.cinema.entity.Cinema;
import com.org.crud.cinema.repository.CinemaRepository;

@Service
public class CinemaService {

	@Autowired
	private CinemaRepository cinemaRepository;

	public Cinema save(Cinema cinema) {
		return cinemaRepository.save(cinema);
	}

	public List<Cinema> findAll() {
		return cinemaRepository.findAll();
	}

	public void delete(Cinema cinema) {
		cinemaRepository.delete(cinema);
	}

	public CinemaRepository getCinemaRepository() {
		return cinemaRepository;
	}

	public void setCinemaRepository(CinemaRepository cinemaRepository) {
		this.cinemaRepository = cinemaRepository;
	}

}
