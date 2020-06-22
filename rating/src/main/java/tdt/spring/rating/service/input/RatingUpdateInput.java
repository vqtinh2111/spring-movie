package tdt.spring.rating.service.input;

import java.time.Instant;
import lombok.Getter;
import tdt.spring.rating.entity.Rating;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@Getter
public class RatingUpdateInput {

  private Integer rate;

  public Rating forUpdate() {
    return new Rating()
        .setRate(rate)
        .setUpdatedAt(Instant.now());
  }

}
