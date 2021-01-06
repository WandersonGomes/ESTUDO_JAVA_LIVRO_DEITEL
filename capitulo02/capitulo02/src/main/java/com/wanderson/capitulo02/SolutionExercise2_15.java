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
public class SolutionExercise2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1, number2;
        int sum, subtraction, product, quotient;
        
        System.out.println("Enter first integer: ");
        number1 = input.nextInt();
        
        System.out.println("Enter second integer: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        subtraction = number1 - number2;
        product = number1 * number2;
        quotient = number1/number2;
        
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Subtraction: %d%n", subtraction);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Quotient: %d%n", quotient);
    
        input.close();
    }
}
