package com.org.crud.cinema.Bean;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.crud.cinema.entity.Cinema;
import com.org.crud.cinema.service.CinemaService;

@ManagedBean
@RequestScoped
public class CinemaBean {

	private String movieName;
	private List<Cinema> movies;

	@Autowired
	private CinemaService cinemaService;

	@PostConstruct
	public void init() {
		setMovies(cinemaService.findAll());
	}

	public void addMovie() {
		Cinema cinema = new Cinema();
		cinema.setMovieName(movieName);
		cinemaService.save(cinema);
		movies = cinemaService.findAll();
	}

	public void deleteMovie(Cinema cinema) {
		cinemaService.delete(cinema);
		movies = cinemaService.findAll();
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public List<Cinema> getMovies() {
		return movies;
	}

	public void setMovies(List<Cinema> movies) {
		this.movies = movies;
	}

}
