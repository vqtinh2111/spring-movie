package tdt.spring.movie_service.controller.form;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.ToString;
import tdt.spring.movie_service.service.input.MovieCreateInput;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@Getter
@ToString
public class MovieCreateForm {

  @NotBlank
  private String movieName;
  @NotBlank
  private String director;
  private String description;

  public MovieCreateInput toInput() {
    return new MovieCreateInput(movieName, director, description);
  }

}
