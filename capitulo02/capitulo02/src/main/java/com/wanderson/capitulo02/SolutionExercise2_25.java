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
public class SolutionExercise2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.println("Enter integer: ");
        number = input.nextInt();
        
        if (number == 0) {
            System.out.println("Number is 0");
        }
        
        if (number != 0) {
            if (number % 2 == 0)
                System.out.println("Even");
            if (number % 2 != 0)
                System.out.println("Odd");
        }
        
        input.close();
    }
}
