package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Exceptions;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Exceptions.MissingMandatoryParameters;

@ComponentScan
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MissingMandatoryParameters.class)
    public ResponseEntity<String> handleMissingParameterException(MissingMandatoryParameters exception) {
        String errorMessage = exception.getMessage();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
    @ExceptionHandler(AlreadyExistingBloodDonor.class)
    public ResponseEntity<String> handleMissingParameterException(AlreadyExistingBloodDonor exception) {
        String errorMessage = exception.getMessage();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
    @ExceptionHandler(NonExistingBoodDonor.class)
    public ResponseEntity<String> handleMissingParameterException(NonExistingBoodDonor exception) {
        String errorMessage = exception.getMessage();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
    }
}
