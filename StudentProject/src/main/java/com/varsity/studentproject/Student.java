/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varsity.studentproject;

/**
 *
 * @author lab_services_student
 */
public class Student {
    
    private String studentNumber;
    private int age;
    private String course;
    private char gender;
    private int year;
    private String name;
    private String surname;
    
    public Student() {
        
    }
    
    public Student(String studentNumber, int age, String course, char gender,
            int year, String name, String surname) {
        
        this.studentNumber = studentNumber;
        this.age = age;
        this.course = course;
        this.gender = gender;
        this.year = year;
        this.name = name;
        this.surname = surname;
        
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    
  
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
