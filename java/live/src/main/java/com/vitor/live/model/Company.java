package com.vitor.live.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Company {
  private Long id;
  private String description;
  private String ssn;
  private String address;
  private String neighboorhood;
  private String city;
  private String state;
  private String phoneNumber;
}
