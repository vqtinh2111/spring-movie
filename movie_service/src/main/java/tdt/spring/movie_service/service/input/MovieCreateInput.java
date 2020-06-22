package tdt.spring.movie_service.service.input;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tdt.spring.movie_service.entity.Movie;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@Getter
@ToString
@AllArgsConstructor
public class MovieCreateInput {

  private String movieName;
  private String director;
  private String description;

  public Movie forCreation() {
    return new Movie()
        .setMovieName(this.movieName)
        .setDirector(this.director)
        .setDescription(this.description)
        .setCreatedAt(Instant.now())
        .setUpdatedAt(Instant.now());
  }

}
