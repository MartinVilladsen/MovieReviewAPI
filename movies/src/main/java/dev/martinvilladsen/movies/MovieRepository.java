package dev.martinvilladsen.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // Lad framework vide at det er et repo
public interface MovieRepository extends MongoRepository<Movie, ObjectId> { // Lad MongoRepo vide hvilken form for data og Id vi arbejder med

    Optional<Movie> findMovieByimdbId(String imdbId);





}
