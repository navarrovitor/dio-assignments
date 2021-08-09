package com.vitor.live.model;

import javax.persistence.ManyToOne;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Location {
  private Long id;
  private String description;

  // foreign key that connects to Access level
  @ManyToOne
  private AccessLevel accessLevel;
}
