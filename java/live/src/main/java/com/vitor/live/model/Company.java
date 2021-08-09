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
public class Company {
  @Id
  private Long id;
  private String description;
  private String ssn;
  private String address;
  private String neighboorhood;
  private String city;
  private String state;
  private String phoneNumber;
}
