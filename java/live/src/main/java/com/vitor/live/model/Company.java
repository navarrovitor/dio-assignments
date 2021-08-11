package com.vitor.live.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.envers.Audited;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Company {
  @Id
  @GeneratedValue
  private Long id;
  private String description;
  private String ssn;
  private String address;
  private String neighboorhood;
  private String city;
  private String state;
  private String phoneNumber;
}
