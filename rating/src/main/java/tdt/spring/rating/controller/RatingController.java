package tdt.spring.rating.controller;

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
import tdt.spring.rating.controller.form.RatingCreateForm;
import tdt.spring.rating.service.RatingService;
import tdt.spring.rating.service.input.RatingCreateInput;
import tdt.spring.rating.service.output.RatingListOutput;
import tdt.spring.rating.service.output.RatingOutput;

/*
  Author:     tinhvq
  Created At: 21/06/2020
*/
@RestController
@RequestMapping("/ratings")
@RequiredArgsConstructor
@Log4j2
public class RatingController {

  private final RatingService ratingService;

  @GetMapping("/{id}")
  public ResponseEntity<RatingOutput> getById(@PathVariable Long id) {
    log.info("start api get rating byId");
    return ResponseEntity.ok(ratingService.getById(id));
  }

  @GetMapping("/movies/{movieId}")
  public ResponseEntity<RatingListOutput> getByMovieId(@PathVariable Long movieId) {
    log.info("api get rating byMovieId");
    return ResponseEntity.ok(ratingService.getByMovieId(movieId));
  }

  @PostMapping
  public ResponseEntity<RatingOutput> insertRating(@Valid @RequestBody RatingCreateForm form) {
    log.info("api insert rating");
    RatingCreateInput input = form.toInput();
    return ResponseEntity.ok(ratingService.insert(input));
  }

}
