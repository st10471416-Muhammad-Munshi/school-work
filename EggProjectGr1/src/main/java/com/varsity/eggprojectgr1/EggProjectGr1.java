/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.eggprojectgr1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class EggProjectGr1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
       String input = JOptionPane.showInputDialog("How mant eggs are you buying?");
       int nbrEggs = Integer.parseInt(input);
       
       final double DOZEN_PRICE = 3.25;
       final double SINGLE_PRICE = 0.45;
       
       int value = nbrEggs / 12;
       int remainder = nbrEggs % 12;
       
       
       double totalDozen = value * DOZEN_PRICE;
       double totalSingle = remainder * SINGLE_PRICE;
       
       double total = totalDozen + totalSingle;
       
       JOptionPane.showMessageDialog(null, " You ordered " + nbrEggs + " eggs, That is "
               + value + " dozen at R " + DOZEN_PRICE + " per dozen and "  + remainder + " loose eggs at "
               + SINGLE_PRICE + " cents each for a total of R " + total +".");
    }
}
