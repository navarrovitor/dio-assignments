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
public class HourBank {
  @AllArgsConstructor
  @NoArgsConstructor
  @EqualsAndHashCode
  @Embeddable
  public class HourBankId implements Serializable {
    private Long hourBankId;
    private Long actionId;
    private Long userId;
  }

  @EmbeddedId
  private HourBankId id;
  private LocalDateTime workedDate;
  private BigDecimal workingTime;
  private BigDecimal balance;
}