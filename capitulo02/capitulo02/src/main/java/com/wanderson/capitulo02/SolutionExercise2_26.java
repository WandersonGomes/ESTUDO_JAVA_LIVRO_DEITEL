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
public class SolutionExercise2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1, number2;
        
        System.out.println("Enter first integer:");
        number1 = input.nextInt();
        
        System.out.println("Enter second integer:");
        number2 = input.nextInt();
        
        if (number1 % number2 == 0) {
            System.out.printf("%d is a multiple of %d%n", number1, number2);
        }
        
        if (number1 % number2 != 0) {
            System.out.printf("%d is not a multiple of %d%n", number1, number2);
        }
        
        input.close();
    }
}
