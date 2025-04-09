/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.testblooddata;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class BloodData {
    

    private String rhFactor;
    private String bloodType;

    public BloodData() {
    this.rhFactor = "+";
    this.bloodType = "O"; 
    }
    

    public BloodData(String bloodType, String rhFactor){
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    
    
}
