/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.studentproject;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class StudentProject {

    public static void main(String[] args) {
       
    Student student1 = new Student();
    
    String studentNumber =JOptionPane.showInputDialog("Enter student number=> ");
    
    String age = JOptionPane.showInputDialog("Enter Student age => ");
    int ageValue = Integer.parseInt(age);        

//    String course = JOptionPane.showInputDialog("Enter student course => ")
    
    student1.setStudentNumber("ST104");
    student1.setAge(34);
    
 //   student1.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter student age => ")));
    
    student1.setCourse(JOptionPane.showInputDialog("Enter student course => "));
    student1.setGender(JOptionPane.showInputDialog("Enter student course => ").charAt(0));
    student1.setYear(Integer.parseInt(JOptionPane.showInputDialog("Please enter your year => ")));
    student1.setName(JOptionPane.showInputDialog("Please enter name => "));
    student1.setSurname(JOptionPane.showInputDialog("Please enter Surname => "));
    
    JOptionPane.showMessageDialog(null, "Student number :: " + student1.getStudentNumber()+
    "\nStudent Age:: " + student1.getAge() +
    "\nStudent Course ::" + student1.getCourse() +
    "\nStudent Gender :: " + student1.getCourse() +
    "\nStudent Year :: " + student1.getYear() +
    "\nStudent Name :: " + student1.getName() +
    "\nStudent Surname :: " + student1.getSurname());
    
    
    Student student2 = new Student("ST421", 40, "Law", '0', 2, "Muhammad", "Munshi");
     }
}
