package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Exceptions;

public class AlreadyExistingBloodDonor extends RuntimeException{
    public AlreadyExistingBloodDonor(String message){
        super(message);
    }
}
