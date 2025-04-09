/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.showstudent2;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ShowStudent2 {

    public static void main(String[] args) {
 
    Student student2 = new Student("9999", 3, 12, 4);
      
    JOptionPane.showMessageDialog(null, student2.toString());
    }
}
