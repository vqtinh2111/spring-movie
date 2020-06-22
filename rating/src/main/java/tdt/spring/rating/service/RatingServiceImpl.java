package tdt.spring.rating.service;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import tdt.spring.rating.entity.Rating;
import tdt.spring.rating.repository.RatingRepository;
import tdt.spring.rating.service.input.RatingCreateInput;
import tdt.spring.rating.service.output.RatingListOutput;
import tdt.spring.rating.service.output.RatingOutput;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@RequiredArgsConstructor
@Service
@Log4j2
public class RatingServiceImpl implements RatingService {

  private final RatingRepository ratingRepository;

  @Override
  public RatingOutput getById(Long id) {
    log.info("handle getById");
    Rating rating = ratingRepository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Rating not found"));
    return new RatingOutput(rating);
  }

  @Override
  public RatingListOutput getByMovieId(Long movieId) {
    log.info("handle getByMovieId");
    List<RatingOutput> ratingOutputs = ratingRepository.findByMovieId(movieId)
        .stream()
        .map(RatingOutput::new)
        .collect(Collectors.toList());
    return new RatingListOutput(ratingOutputs);
  }

  @Override
  public RatingOutput insert(RatingCreateInput input) {
    log.info("handle insert rating");
    Rating rating = ratingRepository.save(input.forCreation());
    return new RatingOutput(rating);
  }

}
