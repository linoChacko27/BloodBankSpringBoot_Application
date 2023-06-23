package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Exceptions;

public class MissingMandatoryParameters extends RuntimeException{
    public MissingMandatoryParameters(String message) {
        super(message);
    }
}
