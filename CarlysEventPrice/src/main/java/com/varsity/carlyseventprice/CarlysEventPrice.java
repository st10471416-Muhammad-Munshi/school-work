/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.carlyseventprice;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */


public class CarlysEventPrice {

    public static void main(String[] args) {

    String input = JOptionPane.showInputDialog("How many guests are attending ?");
      
    int nbrPeople = Integer.parseInt(input);
    
    final double  SINGLE_PRICE = 35.00;
            
    double total = nbrPeople * SINGLE_PRICE;
    
    boolean FiftyOrMore = false;
   
        if (nbrPeople>=50) {
         FiftyOrMore = true;   
        }
       
    JOptionPane.showMessageDialog(null," Carly makes good parties /n The number of people attending the event is "  + nbrPeople + " and the amount they should pay is " + total + FiftyOrMore);
    }
}
