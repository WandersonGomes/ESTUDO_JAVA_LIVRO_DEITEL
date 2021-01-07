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
public class SolutionExercise2_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int weight;
        int height;
        int imc;
        
        System.out.println("Enter weight(Kg):");
        weight = input.nextInt();
        
        System.out.println("Enter height(m):");
        height = input.nextInt();
        
        imc = weight/(height * height);
        
        if (imc < 18.5)
            System.out.println("Status: Underweight");
        if (imc > 30)
            System.out.println("Status: Obese");
        if ((imc >= 18.5) && (imc <= 24.9))
            System.out.println("Status: Normal");
        if ((imc >= 25) && (imc <= 29.9))
            System.out.println("Status: overweight");
        
        input.close();
    }
}
