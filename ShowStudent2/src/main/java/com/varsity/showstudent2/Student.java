/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.showstudent2;

/**
 *
 * @author lab_services_student
 */
public class Student {
     
   private String Id;
   private int Credit;
   private int Points;    
   private double GPA;

    public Student() {
    }
   
   
   
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getCredit() {
        return Credit;
    }

    public void setCredit(int Credit) {
        this.Credit = Credit;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int Points) {
        this.Points = Points;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Student(String Id, int Credit, int Points, double GPA) {
        this.Id = Id;
        this.Credit = Credit;
        this.Points = Points;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", Credit=" + Credit + ", Points=" + Points + ", GPA=" + GPA + '}';
    }

   
}