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
public class SolutionExercise2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.println("Enter an integer:");
        number = input.nextInt();
        
        int first_digit = number / 10000;
        number = number % 10000;
        int second_digit = number / 1000;
        number = number % 1000;
        int third_digit = number / 100;
        number = number % 100;
        int fourth_digit = number / 10;
        number = number % 10;
        int fifth_digit = number;
        
        System.out.printf("%d %d %d %d %d%n", first_digit, second_digit, third_digit, fourth_digit, fifth_digit);
        
        input.close();
    }
}
