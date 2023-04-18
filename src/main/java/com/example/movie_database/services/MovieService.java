package com.example.movie_database.services;

import com.example.movie_database.models.Movie;
import com.example.movie_database.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

   @Autowired
   MovieRepository movieRepository;


    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(int id){
        return movieRepository.findById(id);
    }
}


