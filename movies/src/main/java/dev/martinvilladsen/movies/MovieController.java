package dev.martinvilladsen.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

// I denne controller er vi kun interesseret i at få en request fra brugeren og sende et response

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.allMovies();
    }

    @GetMapping("/{imdbId}")
    public Optional<Movie> getMovieById(@PathVariable String imdbId) {
        return movieService.findMovieById(imdbId);
    }
}
