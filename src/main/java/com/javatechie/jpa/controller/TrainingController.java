package com.javatechie.jpa.controller;
import com.javatechie.jpa.dto.TrainingRequest;
import com.javatechie.jpa.entity.Training;

import com.javatechie.jpa.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/training")
public class TrainingController {
    @Autowired
    private TrainingRepository trainingRepository;


    @Validated
    @PostMapping()
    public ResponseEntity<Training> placeOrder(@Valid @RequestBody TrainingRequest request){
        return new ResponseEntity<Training>(trainingRepository.save(request.getTraining()), HttpStatus.CREATED);
    }

    @GetMapping()
    public List<Training> findAllOrders(){
        return trainingRepository.findAll();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
