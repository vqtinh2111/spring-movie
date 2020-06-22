package tdt.spring.movie_service.entity;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

/*
  Author:     tinhvq
  Created At: 21/06/2020
*/
@Data
@Entity(name = "movies")
@Accessors(chain = true)
public class Movie {

  @Id
  @GeneratedValue
  private Long id;
  private String movieName;
  private String description;
  private String director;
  private Instant createdAt;
  private Instant updatedAt;

}
