/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.testblooddata;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class TestBloodData {

    public static void main(String[] args) {
       
        BloodData bloodData1 = new BloodData();
        
        System.out.println(bloodData1.getBloodType());
        System.out.println(bloodData1.getRhFactor());
        
        String bloodType = JOptionPane.showInputDialog("Please enter a blood type");
        String rhType = JOptionPane.showInputDialog("Please enter an rh factor");
        
        
        BloodData bloodData2 = new BloodData(bloodType, rhFactor);
        System.out.println(bloodData2.getBloodType());
    }
}
