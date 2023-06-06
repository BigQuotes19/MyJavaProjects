package com.mycompany.mavengithub;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BossBeast
 */
import java.util.Scanner;

public class ScoreArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        int[] score = new int[8]; //array 
        
        // initialize the array with user input
       
        for (int i = 0; i < score.length; i++) {
             System.out.println("Input 8 integers(One at a time): ");
            score[i] = input.nextInt();
            
            
        }
        int largest = 0;
             double total = 0.0;
             int smallest = 0;
             double average = 0.0;
         for (int i = 0; i < score.length; i++) {
             
             total += score[i];
             average = total/score.length;
             
             if (i == 0){
                 largest = score[i];
             }
             if (score[i] > largest){
                 largest = score[i];
             }
             if (i ==0){
                 smallest = score[i];
             }
             if (score[i] < smallest){
                 smallest = score[i];
             }
             
         }
         double finalScore = finalscore(total,largest,smallest);
         System.out.printf("Largest is %d%n Smallest is %d%n Total is %.2f%n Average is %.2f%n Final Score is %.2f",largest,smallest,total,average,finalScore);
        
    }
    public static double finalscore(double total,int largest,int smallest){
        double scoreNumber;
        scoreNumber = (total - (largest + smallest))/6;
        double finalScore;
        finalScore = scoreNumber * 3.4;
        return finalScore;
    }
}
