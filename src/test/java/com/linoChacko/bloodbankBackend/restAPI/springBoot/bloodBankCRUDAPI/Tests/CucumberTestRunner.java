package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Tests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.FeatureFiles",
        glue = "com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.StepDefinitions"
)
public class CucumberTestRunner {
}

