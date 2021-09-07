package com.javatechie.jpa.dto;

import com.javatechie.jpa.entity.Training;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.Valid;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class TrainingRequest {
    @Valid
    private Training training;
}
