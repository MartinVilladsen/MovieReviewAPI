package dev.martinvilladsen.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collation = "movies") // Lader framework vide at denne klasse er en del af collectionen
@Data // Lader Lombok vide alle properties get og setters
@AllArgsConstructor // Annotation for at oprette en constructor som tager alle de her private fields
@NoArgsConstructor // Annotation som laver en constructor der ikke tager parametre
public class Movie {
    @Id // Lader framework vide at denne property er det unikke identifier for hver Movie
    private ObjectId id;
    private String imdbId;
    private String title;
    private String release;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

}
