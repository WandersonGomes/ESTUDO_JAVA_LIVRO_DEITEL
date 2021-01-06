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
public class SolutionExercise2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1, number2;
        
        System.out.println("Enter first integer:");
        number1 = input.nextInt();
        
        System.out.println("Enter second integer:");
        number2 = input.nextInt();
        
        if (number1 > number2)
            System.out.printf("%d is larger.%n", number1);
        if (number2 > number1)
            System.out.printf("%d is larger.%n", number2);
        if (number1 == number2)
            System.out.println("These numbers are equal.");
        
        input.close();
    }
}
