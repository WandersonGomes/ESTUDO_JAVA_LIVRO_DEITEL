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
public class SolutionExercise2_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int radius;
        System.out.println("Enter circumference radius:");
        radius = input.nextInt();
        
        System.out.printf("Diameter: %d%n", 2*radius);
        System.out.printf("Circumference Length: %f%n", 2*radius*Math.PI);
        System.out.printf("Circumference Area: %f%n", Math.PI*radius*radius);
        
        input.close();
    }
}
