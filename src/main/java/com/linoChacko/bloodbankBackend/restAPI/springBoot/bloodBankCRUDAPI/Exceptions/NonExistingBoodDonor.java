package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Exceptions;

public class NonExistingBoodDonor extends RuntimeException{
    public NonExistingBoodDonor(String message){
        super(message);
    }
}
