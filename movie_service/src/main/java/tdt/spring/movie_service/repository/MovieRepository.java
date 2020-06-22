package tdt.spring.movie_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tdt.spring.movie_service.entity.Movie;

/*
  Author:     tinhvq
  Created At: 22/06/2020
*/
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
