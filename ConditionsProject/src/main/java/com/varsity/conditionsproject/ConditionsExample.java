/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.conditionsproject;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ConditionsExample {
    public static void main(String[] args ){
    
    char gender = JOptionPane.showInputDialog("please provide a gender (M, F, O)").charAt(0);
    int age = Integer.parseInt(JOptionPane.showInputDialog("please provide an age"));
    
        if(gender == 'F' && age >= 21) {
    JOptionPane.showMessageDialog(null, "you are a female major");
        }else if (gender =='F' && age < 21){
    JOptionPane.showMessageDialog(null, "you are a female minor");
} else if(gender == 'M' && age >= 18){
    JOptionPane.showMessageDialog(null, "you are a male major");
    } else if(gender == 'M' && age <= 18){
    JOptionPane.showMessageDialog(null, "you are a male minor");
}
    
    int height = 100;
    
    if(gender == '0' && age == 18 || height == 100 ){
    }
    
    if(gender == 'M'){
        System.out.println("Male");
    }else {
        System.out.println("Female");
    }    
        System.out.println(gender == 'M' ? "Male" : "Female");
    }
}
        



