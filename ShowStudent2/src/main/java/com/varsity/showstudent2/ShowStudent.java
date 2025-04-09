/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.showstudent2;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ShowStudent {
    
  public static void main(String[] args){
      Student student1 = new Student();
  
      student1.setId(JOptionPane.showInputDialog("Enter id number "));
      student1.setCredit(Integer.parseInt(JOptionPane.showInputDialog("Enter credit ")));
      student1.setPoints(Integer.parseInt(JOptionPane.showInputDialog("Enter points ")));
      student1.setGPA(student1.getPoints()/student1.getCredit());
  
  JOptionPane.showMessageDialog(null,"The GPA is " + student1.getGPA());
}
}
