package com.vitor.live.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class WorkJourney {
  @Id
  private Long id;
  private String description;
}
