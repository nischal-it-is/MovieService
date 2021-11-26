package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.nischal.beans.Movie;
import com.nischal.persistence.MovieDao;

@SpringBootApplication(scanBasePackages = "com.nischal")
@EntityScan(basePackages = "com.nischal.beans")
@EnableJpaRepositories(basePackages = "com.nischal.persistence")
public class MovieServiceApplication {

	@Autowired
	private MovieDao movieDao;
	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		movieDao.save(new Movie("M001","Bahubali"));
//		movieDao.save(new Movie("M002", "RRR"));
//		movieDao.save(new Movie("M003", "Titanic"));
//		movieDao.save(new Movie("M004", "Tenant"));
//		movieDao.save(new Movie("M005", "Inception"));
//		
//	}
}
