package tdt.spring.rating.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdt.spring.rating.entity.Rating;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

  List<Rating> findByMovieId(Long movieId);

}
