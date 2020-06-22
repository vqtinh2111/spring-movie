package tdt.spring.rating.service.input;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import tdt.spring.rating.entity.Rating;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@Getter
@AllArgsConstructor
public class RatingCreateInput {

  private Long movieId;
  private Integer rate;

  public Rating forCreation() {
    return new Rating()
        .setMovieId(movieId)
        .setRate(rate)
        .setCreatedAt(Instant.now())
        .setUpdatedAt(Instant.now());
  }

}
