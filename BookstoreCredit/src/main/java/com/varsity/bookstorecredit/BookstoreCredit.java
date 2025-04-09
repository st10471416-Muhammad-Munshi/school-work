/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.bookstorecredit;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class BookstoreCredit {

    public static void main(String[] args) {
        System.out.println("Hello World!");        
  Scanner inputdevice = new Scanner(System.in);       
 
  System.out.println("Enter your name");
  String name = inputdevice.nextLine(); 
 
 
 System.out.println("Enter your GPA");
  double GPA = inputdevice.nextDouble();

  double credit = GPA * 10;
 
  System.out.println("The student " + name + " has received the gpa of " + GPA + " and therefore receieves a credit of R"+ credit);
    }
}
