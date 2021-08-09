package com.vitor.live.model;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendar {
  private Long id;
  private String description;
  private LocalDateTime specialDate;
  private DataType dataType;
}
