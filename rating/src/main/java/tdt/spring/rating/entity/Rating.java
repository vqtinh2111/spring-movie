package tdt.spring.rating.entity;

/*
  Author:     tinhvq
  Created At: 21/06/2020
*/

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Entity(name = "ratings")
public class Rating {

  @Id
  @GeneratedValue
  private Long id;
  private Long movieId;
  private Integer rate;
  private Instant createdAt;
  private Instant updatedAt;

}
