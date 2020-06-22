package tdt.spring.movie_service.dto;

import lombok.Getter;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@Getter
public class RatingOutput {

  private Long id;
  private Long movieId;
  private Integer rate;

}
