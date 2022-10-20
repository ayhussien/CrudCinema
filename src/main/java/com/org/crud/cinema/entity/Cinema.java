package com.org.crud.cinema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cinema")
public class Cinema {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Long id;

	@Column(name = "MOVIE_NAME")
	private String movieName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
