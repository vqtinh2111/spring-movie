package tdt.spring.movie_service.service.output;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;
import tdt.spring.movie_service.dto.RatingListOutput;
import tdt.spring.movie_service.entity.Movie;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@Getter
@ToString
public class MovieOutput {

  private Long id;
  private String movieName;
  private String director;
  private String description;
  private RatingListOutput ratings;

  public MovieOutput(Movie movie) {
    this.id = movie.getId();
    this.movieName = movie.getMovieName();
    this.director = movie.getDirector();
    this.description = movie.getDescription();
  }

  public MovieOutput(Movie movie, RatingListOutput ratings) {
    this.id = movie.getId();
    this.movieName = movie.getMovieName();
    this.director = movie.getDirector();
    this.description = movie.getDescription();
    this.ratings = ratings;
  }

}
