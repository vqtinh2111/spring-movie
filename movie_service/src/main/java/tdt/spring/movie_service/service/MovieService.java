package tdt.spring.movie_service.service;

import tdt.spring.movie_service.service.input.MovieCreateInput;
import tdt.spring.movie_service.service.output.MovieListOutput;
import tdt.spring.movie_service.service.output.MovieOutput;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
public interface MovieService {

  MovieListOutput getAll();

  MovieOutput getById(Long id);

  MovieOutput save(MovieCreateInput input);

}
