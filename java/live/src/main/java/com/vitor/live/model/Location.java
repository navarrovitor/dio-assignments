package com.vitor.live.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Location {
  @Id
  @GeneratedValue
  private Long id;
  private String description;

  // foreign key that connects to Access level
  @ManyToOne
  private AccessLevel accessLevel;
}
