package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Configurations;

import net.masterthought.cucumber.Configuration;
        import net.masterthought.cucumber.ReportBuilder;
        import net.masterthought.cucumber.json.Feature;
        import net.masterthought.cucumber.json.support.Status;
        import java.io.File;
        import java.util.ArrayList;
        import java.util.List;

public class CucumberExtentReport {

    public static void generateReport() {
        String jsonReportDirectory = "target/TestResults/JSONReports";
        String reportOutputDirectory = "target/TestResults/HTMLReports";

        File jsonDirectory = new File(jsonReportDirectory);
        File reportDirectory = new File(reportOutputDirectory);

        List<String> jsonFiles = new ArrayList<>();
        for (File file : jsonDirectory.listFiles()) {
            if (file.getName().endsWith(".json")) {
                jsonFiles.add(file.getAbsolutePath());
            }
        }

        Configuration configuration = new Configuration(reportDirectory, "Blood Bank CRUD API");
        configuration.setBuildNumber("1");

        List<Feature> features = new ArrayList<>();
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
