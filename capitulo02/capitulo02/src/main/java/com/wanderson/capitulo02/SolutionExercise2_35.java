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
public class SolutionExercise2_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalKm;
        double priceLiter;
        double averageKm;
        double rateParking;
        double toll;
        
        System.out.println("Enter total km:");
        totalKm = input.nextInt();
        
        System.out.println("Enter price per liter:");
        priceLiter = input.nextDouble();
        
        System.out.println("Enter average km:");
        averageKm = input.nextDouble();
        
        System.out.println("Enter rate parking:");
        rateParking = input.nextDouble();
        
        System.out.println("Enter toll liter:");
        toll = input.nextDouble();
        
        //nao encontrei a formula... Fica para depois.
        
        input.close();
    }
}
