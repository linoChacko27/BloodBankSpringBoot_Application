package com.linoChacko.bloodbankBackend.restAPI.springBoot.bloodBankCRUDAPI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BloodDonor {
    @Id
    @GeneratedValue
    private Long bDonor_ID;
    private String bDonor_Name;
    private String bDonor_Age;
    private String bDonor_Bloodgroup;
    private String bDonor_Height;
    private String bDonor_Weight;
    private String bDonor_ContactNo;
    private String bDonor_EmailID;

    //Getters and Setters
    public Long getbDonor_ID() {
        return bDonor_ID;
    }

    public void setbDonor_ID(Long bDonor_ID) {
        this.bDonor_ID = bDonor_ID;
    }

    public String getbDonor_Name() {
        return bDonor_Name;
    }

    public void setbDonor_Name(String bDonor_Name) {
        this.bDonor_Name = bDonor_Name;
    }

    public String getbDonor_Age() {
        return bDonor_Age;
    }

    public void setbDonor_Age(String bDonor_Age) {
        this.bDonor_Age = bDonor_Age;
    }

    public String getbDonor_Bloodgroup() {
        return bDonor_Bloodgroup;
    }

    public void setbDonor_Bloodgroup(String bDonor_Bloodgroup) {
        this.bDonor_Bloodgroup = bDonor_Bloodgroup;
    }

    public String getbDonor_Height() {
        return bDonor_Height;
    }

    public void setbDonor_Height(String bDonor_Height) {
        this.bDonor_Height = bDonor_Height;
    }

    public String getbDonor_Weight() {
        return bDonor_Weight;
    }

    public void setbDonor_Weight(String bDonor_Weight) {
        this.bDonor_Weight = bDonor_Weight;
    }

    public String getbDonor_ContactNo() {
        return bDonor_ContactNo;
    }

    public void setbDonor_ContactNo(String bDonor_ContactNo) {
        this.bDonor_ContactNo = bDonor_ContactNo;
    }

    public String getbDonor_EmailID() {
        return bDonor_EmailID;
    }

    public void setbDonor_EmailID(String bDonor_EmailID) {
        this.bDonor_EmailID = bDonor_EmailID;
    }


}
