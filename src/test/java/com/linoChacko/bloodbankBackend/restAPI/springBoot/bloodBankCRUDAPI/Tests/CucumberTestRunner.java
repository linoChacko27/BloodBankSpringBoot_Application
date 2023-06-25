package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Tests;

import com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Configurations.CucumberExtentReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.FeatureFiles",
        glue = "com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.StepDefinitions"
)
public class CucumberTestRunner {
    @AfterClass
    public static void generateReport() {
        CucumberExtentReport.generateReport();
    }

}

