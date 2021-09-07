package com.javatechie.jpa.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Address {
    @Id
    @GeneratedValue
    private int aid;
    private String detailedAddress;
    private String City;
    private String State;
    private String Pincode;

}
