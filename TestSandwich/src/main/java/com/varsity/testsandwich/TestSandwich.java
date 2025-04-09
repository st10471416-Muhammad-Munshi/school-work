/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.varsity.testsandwich;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class TestSandwich {

    public static void main(String[] args) {
        Sandwich sandwich1 = new Sandwich();
    
    
    sandwich1.setIngredient1(JOptionPane.showInputDialog("Enter Ingredient => "));
    sandwich1.setType(JOptionPane.showInputDialog("Enter Type of bread => "));
    sandwich1.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Enter Price =>")));
    
 JOptionPane.showMessageDialog(null, "The Ingredient is = " + sandwich1.getIngredient1() + "The Type of Bread is " + sandwich1.getType() + "The Price is " + sandwich1.getPrice());
}
}
