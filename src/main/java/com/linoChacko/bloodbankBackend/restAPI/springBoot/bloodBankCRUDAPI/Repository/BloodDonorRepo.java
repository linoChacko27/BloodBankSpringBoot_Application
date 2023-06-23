package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Repository;

import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Model.BloodDonor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodDonorRepo extends JpaRepository<BloodDonor, Long> {
}
