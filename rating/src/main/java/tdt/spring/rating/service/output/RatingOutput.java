package tdt.spring.rating.service.output;

import lombok.Getter;
import tdt.spring.rating.entity.Rating;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@Getter
public class RatingOutput {

  private Long id;
  private Long movieId;
  private Integer rate;

  public RatingOutput(Rating rating) {
    this.id = rating.getId();
    this.movieId = rating.getMovieId();
    this.rate = rating.getRate();
  }

}
