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
public class SolutionExercise2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1, number2, number3, product;
        
        System.out.println("Enter first integer:");
        number1 = input.nextInt();
        
        System.out.println("Enter second integer:");
        number2 = input.nextInt();
        
        System.out.println("Enter third integer:");
        number3 = input.nextInt();
        
        product = number1 * number2 * number3;
        
        System.out.printf("Product is %d%n", product);
        
        input.close();
    }
}
