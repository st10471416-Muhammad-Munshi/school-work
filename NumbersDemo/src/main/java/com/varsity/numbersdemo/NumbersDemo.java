/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.varsity.numbersdemo;

/**
 *
 * @author lab_services_student
 */
public class NumbersDemo {

    public static void main(String[] args) {
        int number1 = 50;
        int number2 = 25;
        displayTwiceTheNumber(number1, number2);

        number1 = 30;

        displayNumberPlusFive(number1, number2);

        number2 = 10;
        displayNumberSquared(number1, number2);

    }

    public static void displayTwiceTheNumber(int num1, int num2) {

        num1 = num1 + 2;
        System.out.println(num1);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num2);

    }

    public static void displayNumberPlusFive(int num1, int num2) {

        int result1 = num1 + 5;
        int result2 = num2 + 5;

        System.out.println(result1);
        System.out.println(result2);
    }

    public static void displayNumberSquared(int number1, int number2) {

        double result1 = Math.sqrt(number1);
        double result2 = Math.sqrt(number2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
