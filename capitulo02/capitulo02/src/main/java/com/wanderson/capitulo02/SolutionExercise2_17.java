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
public class SolutionExercise2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1, number2, number3;
        int sum, average, product, higherNumber, lowerNumber;
        
        System.out.println("Enter first integer:");
        number1 = input.nextInt();
        
        System.out.println("Enter second integer:");
        number2 = input.nextInt();
        
        System.out.println("Enter third integer:");
        number3 = input.nextInt();
        
        sum = number1 + number2 + number3;
        average = sum/3;
        product = number1 * number2 * number3;
        
        higherNumber = number1;
        lowerNumber = number1;
        
        if (number2 > higherNumber)
            higherNumber = number2;
        if (number3 > higherNumber)
            higherNumber = number3;
        
        if (number2 < lowerNumber)
            lowerNumber = number2;
        if (number3 < lowerNumber)
            lowerNumber = number3;
        
        
        //show results
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);
        
        System.out.printf("Higher Number: %d%n", higherNumber);
        System.out.printf("Lower Number: %d%n", lowerNumber);
        
        input.close();
    }
}
