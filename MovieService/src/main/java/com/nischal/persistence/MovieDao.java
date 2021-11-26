package com.nischal.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nischal.beans.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, String> {

}
