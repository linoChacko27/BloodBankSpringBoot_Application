package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Service;

import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Model.BloodDonor;

import java.util.List;

public interface BloodDonorCRUDService {

    public List<BloodDonor> getAllBloodDonorDetails();
    public BloodDonor getBloodDonorDetails(Long bDonor_ID);
    public String addNewBloodDonorDetails(BloodDonor bloodDonor);
    public String updateBloodDonorDetails(BloodDonor bloodDonor);
    public String deleteBloodDonorDetails(Long bDonor_ID);

}
