package tdt.spring.rating.service;

import tdt.spring.rating.service.input.RatingCreateInput;
import tdt.spring.rating.service.output.RatingListOutput;
import tdt.spring.rating.service.output.RatingOutput;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
public interface RatingService {

  RatingOutput getById(Long id);

  RatingListOutput getByMovieId(Long movieId);

  RatingOutput insert(RatingCreateInput input);

}
