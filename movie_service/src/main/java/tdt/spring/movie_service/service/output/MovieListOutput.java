package tdt.spring.movie_service.service.output;

import java.util.List;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/

@Data
@Accessors(chain = true)
@RequiredArgsConstructor
public class MovieListOutput {

  private final List<MovieOutput> movieOutputList;

}
