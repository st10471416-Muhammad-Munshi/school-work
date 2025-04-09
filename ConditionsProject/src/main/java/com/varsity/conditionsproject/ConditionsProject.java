/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.conditionsproject;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ConditionsProject {

    public static void main(String[] args) {
      
        String name = JOptionPane.showInputDialog("Please give me your name => ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age =>"));
        
        if(age >= 18) {
            JOptionPane.showMessageDialog(null, " hey" + name + ", congratulations !!! you can enter the premise because your age"
                    + age + " is more than 18 or equal ");
            
        }else{
            JOptionPane.showMessageDialog(null, " hey" + name + ", sorry !!! you can not enter the premise because your age "
                    + age + " is less than 18 ");
        }
        
        int number = Integer.parseInt(JOptionPane.showInputDialog("please enter a number"));
        
        if(number >= 0){
            JOptionPane.showMessageDialog(null, "This number" + number + "is positive");
            
            if(number % 5 == 0) {
                JOptionPane.showMessageDialog(null, "This number" + number + "is a multiple of 5");
            }else{
              JOptionPane.showMessageDialog(null, "This number" + number + "is not a multiple of 5");  
            }
        }else{
            JOptionPane.showMessageDialog(null, "The number" + number + "is negative");
        }
        
        
        
    }}
