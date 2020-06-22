package tdt.spring.movie_service.controller;

import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import tdt.spring.movie_service.controller.form.MovieCreateForm;
import tdt.spring.movie_service.entity.Movie;
import tdt.spring.movie_service.service.MovieService;
import tdt.spring.movie_service.service.input.MovieCreateInput;
import tdt.spring.movie_service.service.output.MovieListOutput;
import tdt.spring.movie_service.service.output.MovieOutput;

/*
  Author:     tinhvq
  Created At: 21/06/2020
*/
@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
@Log4j2
public class MovieController {

  private final MovieService movieService;

  @GetMapping("/{movieId}")
  public ResponseEntity<MovieOutput> getById(@PathVariable Long movieId) {
    log.info("Start api GET movie by id");
    return ResponseEntity.ok(movieService.getById(movieId));
  }

  @PostMapping
  public ResponseEntity<MovieOutput> createMovie(@Valid @RequestBody MovieCreateForm form) {
    log.debug("Start api create movie");
    MovieCreateInput input = form.toInput();
    return ResponseEntity.ok(movieService.save(input));
  }

  @GetMapping
  public ResponseEntity<MovieListOutput> getAllMovie() {
    log.debug("Start api get all movies");
    return ResponseEntity.ok(movieService.getAll());
  }

}
