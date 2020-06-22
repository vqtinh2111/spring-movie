package tdt.spring.rating.service.output;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@Getter
@NoArgsConstructor
public class RatingListOutput {

  private List<RatingOutput> ratingOutputs;
  private Double avgRating;

  public RatingListOutput(List<RatingOutput> ratingOutputs) {
    this.ratingOutputs = ratingOutputs;
    this.avgRating = ratingOutputs.stream()
        .mapToInt(RatingOutput::getRate)
        .average()
        .orElse(0D);
  }

}
