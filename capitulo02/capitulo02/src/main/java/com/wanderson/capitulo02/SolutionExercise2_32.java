/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanderson.capitulo02;

import java.util.Scanner;
/**
 *
 * @author lobonegro
 */
public class SolutionExercise2_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1, number2, number3, number4, number5;
        int amount_positive = 5;
        int amount_negative = 5;
        int amount_zero = 5;
        
        System.out.println("Enter first integer:");
        number1 = input.nextInt();
        System.out.println("Enter second integer:");
        number2 = input.nextInt();
        System.out.println("Enter third integer:");
        number3 = input.nextInt();
        System.out.println("Enter foufth integer:");
        number4 = input.nextInt();
        System.out.println("Enter fifth integer:");
        number5 = input.nextInt();
        
        //number1
        if (number1 > 0) {
            amount_negative = amount_negative - 1;
            amount_zero = amount_zero - 1;
        }
        if (number1 < 0) {
            amount_positive = amount_positive - 1;
            amount_zero = amount_zero - 1;
        }
        if (number1 == 0) {
            amount_positive = amount_positive - 1;
            amount_negative = amount_negative - 1;
        }
        
        //number2
        if (number2 > 0) {
            amount_negative = amount_negative - 1;
            amount_zero = amount_zero - 1;
        }
        if (number2 < 0) {
            amount_positive = amount_positive - 1;
            amount_zero = amount_zero - 1;
        }
        if (number2 == 0) {
            amount_positive = amount_positive - 1;
            amount_negative = amount_negative - 1;
        }
        
        //number3
        if (number3 > 0) {
            amount_negative = amount_negative - 1;
            amount_zero = amount_zero - 1;
        }
        if (number3 < 0) {
            amount_positive = amount_positive - 1;
            amount_zero = amount_zero - 1;
        }
        if (number3 == 0) {
            amount_positive = amount_positive - 1;
            amount_negative = amount_negative - 1;
        }
        
        //number4
        if (number4 > 0) {
            amount_negative = amount_negative - 1;
            amount_zero = amount_zero - 1;
        }
        if (number4 < 0) {
            amount_positive = amount_positive - 1;
            amount_zero = amount_zero - 1;
        }
        if (number4 == 0) {
            amount_positive = amount_positive - 1;
            amount_negative = amount_negative - 1;
        }
        
        //number5
        if (number5 > 0) {
            amount_negative = amount_negative - 1;
            amount_zero = amount_zero - 1;
        }
        if (number5 < 0) {
            amount_positive = amount_positive - 1;
            amount_zero = amount_zero - 1;
        }
        if (number5 == 0) {
            amount_positive = amount_positive - 1;
            amount_negative = amount_negative - 1;
        }
        
        System.out.printf("Amount positives: %d%n", amount_positive);
        System.out.printf("Amount negatives: %d%n", amount_negative);
        System.out.printf("Amount zero: %d%n", amount_zero);
        
        input.close();
    }
}
