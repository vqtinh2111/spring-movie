package tdt.spring.rating.controller.form;

import lombok.Getter;
import tdt.spring.rating.service.input.RatingCreateInput;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@Getter
public class RatingCreateForm {

  private Long movieId;
  private Integer rate;

  public RatingCreateInput toInput() {
    return new RatingCreateInput(movieId, rate);
  }

}
