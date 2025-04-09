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
public class TestPatient {
    
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        
        System.out.println("Patient ID number => " + patient1.getIdNumber());
         System.out.println("Patient age => " + patient1.getAge());
          System.out.println("Patient Blood Data  => " + patient1.getBloodData().toString());
          
          
          String idNumber = JOptionPane.showInputDialog("Please enter id number");
          int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter age"));
                  
          BloodData bloodData = new BloodData("AB", "-");  
          
          Patient patient2 = new Patient(idNumber, 0, bloodData);
          
          
           System.out.println("Patient ID number => " + patient2.getIdNumber());
         System.out.println("Patient age => " + patient2.getAge());
          System.out.println("Patient Blood Data  => " + patient2.getBloodData().toString());
    }
    
}
