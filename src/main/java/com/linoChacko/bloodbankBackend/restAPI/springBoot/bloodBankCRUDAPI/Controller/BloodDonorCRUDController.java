package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Controller;

import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Model.BloodDonor;
import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Service.BloodDonorCRUDService;
import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Exceptions.MissingMandatoryParameters;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bloodBank")
public class BloodDonorCRUDController {

    BloodDonorCRUDService bloodDonorCRUDService;
    public BloodDonorCRUDController(BloodDonorCRUDService bloodDonorCRUDService) {
        this.bloodDonorCRUDService = bloodDonorCRUDService;
    }

    @GetMapping(value = "/allDonorDetails")
    public List<BloodDonor> getAllBloodDonorDetails(){
     return bloodDonorCRUDService.getAllBloodDonorDetails();
    }

    @GetMapping(value = "getDonorDetails/{bDonor_ID}")
    public BloodDonor getBloodDonorDetails(@PathVariable("bDonor_ID") Long bDonor_ID){
        if (bDonor_ID== null) {
            throw new MissingMandatoryParameters("Please Enter a Blood Donor ID");
        }
        else return bloodDonorCRUDService.getBloodDonorDetails(bDonor_ID);
    }

    @PostMapping(value = "/addNewBloodDonorDetails")
    public String addNewBloodDonor(@RequestBody BloodDonor bloodDonor){

        return bloodDonorCRUDService.addNewBloodDonorDetails(bloodDonor);
    }

    @PutMapping(value = "/updateBloodDonorDetails")
    public String updateNewBloodDonor(@RequestBody BloodDonor bloodDonor){
        return bloodDonorCRUDService.updateBloodDonorDetails(bloodDonor);
    }
    @DeleteMapping(value="/deleteBloodDonorDetails/{bDonor_ID}")
    public String deleteBloodDonor(@PathVariable("bDonor_ID") Long bDonor_ID) {
        return bloodDonorCRUDService.deleteBloodDonorDetails(bDonor_ID);
    }

}
