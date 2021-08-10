package com.vitor.live.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Action {

  @AllArgsConstructor
  @NoArgsConstructor
  @EqualsAndHashCode
  @Embeddable
  public class ActionId implements Serializable {
    private Long actionId;
    private Long userId;
  }

  @EmbeddedId
  private ActionId id;
  private LocalDateTime start;
  private LocalDateTime end;
  private BigDecimal period;
  @ManyToOne
  private Occurrence occurrence;
  @ManyToOne
  private Calendar calendar;
}