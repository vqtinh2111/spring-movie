package tdt.spring.movie_service.dto;

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

}
