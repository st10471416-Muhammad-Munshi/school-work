/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.myshopapp;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class MyShopApp {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
         
        String item1 ="sweets", item2 ="drinks", item3 ="chips" ;
        double price1 = 2, price2 = 5 ,price3 = 3;
        int numItems =0;
        
        System.out.println("How many items would you like to buy of each?\n"
              +item1+" are R"+price1+ " "+item2+" are R"+price2+" and "+item3+" are R"+price3);
        numItems = input.nextInt(); // input 3
        
        double totalPrice = 0;
        int count =0;
        
        while (count < numItems) {            
           totalPrice = totalPrice + price1 + price2 + price3 ;
           count = count +1;
        }
        
        System.out.println("The total price is R"+totalPrice);
    }
    
}
