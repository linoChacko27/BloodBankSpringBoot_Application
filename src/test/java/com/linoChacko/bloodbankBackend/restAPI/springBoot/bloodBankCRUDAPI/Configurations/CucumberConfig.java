package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Configurations;
import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.BloodDonorCRUD_Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest
@ContextConfiguration(classes = BloodDonorCRUD_Application.class)
public class CucumberConfig {
}
