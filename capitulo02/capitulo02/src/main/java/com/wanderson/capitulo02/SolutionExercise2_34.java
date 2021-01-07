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
public class SolutionExercise2_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        long world_population;
        double rate;
        
        System.out.println("Enter World population:");
        world_population = input.nextLong();
        
        System.out.println("Enter growth rate:");
        rate = input.nextDouble();
        
        world_population = (long) (world_population+(world_population*(rate/100)));        
        System.out.printf("Population one year: %d%n", world_population);
        
        world_population = (long) (world_population+(world_population*(rate/100)));
        System.out.printf("Population two year: %d%n", world_population);
        
        world_population = (long) (world_population+(world_population*(rate/100)));
        System.out.printf("Population three year: %d%n", world_population);
        
        world_population = (long) (world_population+(world_population*(rate/100)));
        System.out.printf("Population four year: %d%n", world_population);

        world_population = (long) (world_population+(world_population*(rate/100)));        
        System.out.printf("Population five year: %d%n", world_population);
        
        input.close();
    }
}
