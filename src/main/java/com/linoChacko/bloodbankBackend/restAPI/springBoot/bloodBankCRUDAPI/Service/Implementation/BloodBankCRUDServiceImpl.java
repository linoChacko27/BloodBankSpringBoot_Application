package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Service.Implementation;

import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Exceptions.AlreadyExistingBloodDonor;
import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Exceptions.MissingMandatoryParameters;
import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Exceptions.NonExistingBoodDonor;
import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Model.BloodDonor;
import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Repository.BloodDonorRepo;
import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Service.BloodDonorCRUDService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodBankCRUDServiceImpl implements BloodDonorCRUDService {
    BloodDonorRepo bloodDonorRepo;
    public BloodBankCRUDServiceImpl(BloodDonorRepo bloodDonorRepo) {
        this.bloodDonorRepo = bloodDonorRepo;
    }


    @Override
    public List<BloodDonor> getAllBloodDonorDetails() {
        return bloodDonorRepo.findAll();
    }

    @Override
    public BloodDonor getBloodDonorDetails(Long bDonor_ID) {
            return bloodDonorRepo.findById(bDonor_ID).get();
    }

    @Override
    public String addNewBloodDonorDetails(@NotNull BloodDonor bloodDonor) {

        if (bloodDonor.getbDonor_Name() == null) {
            throw new MissingMandatoryParameters("Missing parameter: 'Donor Name'");
        }
        if (bloodDonor.getbDonor_Age() == null) {
            throw new MissingMandatoryParameters("Missing parameter: 'Donor Age'");
        }
        if (bloodDonor.getbDonor_Bloodgroup() == null) {
            throw new MissingMandatoryParameters("Missing parameter: 'Donor BloodGroup'");
        }
        if (bloodDonor.getbDonor_Height() == null) {
            throw new MissingMandatoryParameters("Missing parameter: 'Donor Height'");
        }
        if (bloodDonor.getbDonor_Weight()== null) {
            throw new MissingMandatoryParameters("Missing parameter: 'Donor Weight'");
        }
        if (bloodDonor.getbDonor_ContactNo()== null) {
            throw new MissingMandatoryParameters("Missing parameter: 'Donor Contact Number'");
        }
        else {
            Long bDonorId = bloodDonor.getbDonor_ID();
            if (bloodDonorRepo.existsById(bDonorId)) {
                throw new AlreadyExistingBloodDonor("The provided bDonor_ID already exists.");
                } else {
                bloodDonorRepo.save(bloodDonor);
                return "New Blood Donor Details Added Successfully";
            }
        }
        }
    @Override
    public String updateBloodDonorDetails(BloodDonor bloodDonor) {

        Long bDonorId = bloodDonor.getbDonor_ID();
        if (bloodDonorRepo.existsById(bDonorId)) {
            bloodDonorRepo.save(bloodDonor);
            return "Blood Donor Details Updated Successfully";

        }
        else {
            throw new NonExistingBoodDonor("No user found for the provided bDonor_ID");
            }

    }

    @Override
    public String deleteBloodDonorDetails(Long bDonor_ID) {
        if (bloodDonorRepo.existsById(bDonor_ID) == true) {
            bloodDonorRepo.deleteById(bDonor_ID);
            return "Blood Donor Details Deleted Successfully"  ;
        }
        else  throw new NonExistingBoodDonor("No user found for the provided bDonor_ID");
        }

    }

