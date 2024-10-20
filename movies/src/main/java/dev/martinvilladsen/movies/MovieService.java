package dev.martinvilladsen.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Det er en Serviceklasse
public class MovieService {

    @Autowired // Lader framework vide at vi vil have det instansiere klassen (MovieRep..) for os
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll(); // findAll er en del af MongoRepo klassen
    }

    public Optional<Movie> findMovieById(String imdbId) {
        return movieRepository.findMovieByimdbId(imdbId);
    }
}
