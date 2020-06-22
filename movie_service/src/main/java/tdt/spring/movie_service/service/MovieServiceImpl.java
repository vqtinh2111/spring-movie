package tdt.spring.movie_service.service;

import static tdt.spring.movie_service.common.ServiceConstant.*;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import tdt.spring.movie_service.common.ServiceConstant;
import tdt.spring.movie_service.dto.RatingListOutput;
import tdt.spring.movie_service.entity.Movie;
import tdt.spring.movie_service.repository.MovieRepository;
import tdt.spring.movie_service.service.input.MovieCreateInput;
import tdt.spring.movie_service.service.output.MovieListOutput;
import tdt.spring.movie_service.service.output.MovieOutput;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@RequiredArgsConstructor
@Service
@Log4j2
public class MovieServiceImpl implements MovieService {

  private final MovieRepository movieRepository;
  private final WebClient.Builder builder;


  @Override
  public MovieListOutput getAll() {
    log.debug("Start handle getAll movies");
    List<MovieOutput> movieOutputs = movieRepository.findAll().stream()
        .map(MovieOutput::new)
        .collect(Collectors.toList());
    return new MovieListOutput(movieOutputs);
  }

  @Override
  public MovieOutput getById(Long id) {
    log.debug("handle get movie byId");
    Movie movie = movieRepository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Movie not found!!"));
    RatingListOutput ratings = fetchRatingByMovieId(id);
    return new MovieOutput(movie, ratings);
  }

  private RatingListOutput fetchRatingByMovieId(Long id) {
    String uri = "http://" + RATING_SERVICE + "/ratings/movies/" + id;
    return builder.build()
        .get()
        .uri(uri)
        .retrieve()
        .bodyToMono(RatingListOutput.class)
        .block();
  }

  @Override
  public MovieOutput save(MovieCreateInput input) {
    log.debug("handle save movie");
    Movie movie = movieRepository.save(input.forCreation());
    return new MovieOutput(movie);
  }
}
