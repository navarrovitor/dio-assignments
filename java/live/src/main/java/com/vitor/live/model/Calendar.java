package com.vitor.live.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
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
public class Calendar {
  @Id
  private Long id;
  private String description;
  private LocalDateTime specialDate;
  @ManyToOne
  private DataType dataType;
}
