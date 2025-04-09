/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.paymentcalculator;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class PaymentCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Hourly Rate >>");
        double hourlyRate = input.nextDouble();
        
        System.out.println("Enter Hours Worked >>");
        double hoursWorked = input.nextDouble();
        
        double weeklyPay = hourlyRate * hoursWorked;
        
        System.out.println("An employee who makes R" + hourlyRate + "per hour");
        System.out.println("and works" + hoursWorked + "hours");
        System.out.println("earns R" + weeklyPay + "in a week");
        
        input.close();
    }
}
