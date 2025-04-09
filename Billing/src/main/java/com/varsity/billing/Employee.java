/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.billing;

/**
 *
 * @author lab_services_student
 */
public class Employee {
    
    Public double calculateSalary(double rate, int hours) {
        return rate * hours
    }
    
    public double calculateSalary(double rate,int hours, double bonusValue){
        return (rate * hours) + bonusValue;
    }
    
    public void displayEmpDetails(String name, String surname) {
        System.out.println("Name =>" + name + "Surname=> " + surname);
    }
    
    public void displayEmpDetails(String name, String surname, int age) {
        System.out.println("Name=>" + name + "Surname =>" + surname + "Age=>" ;
    }