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

public class GasMileage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalMPG = 0.00;
        int totalGallons = 0;
        int totalmilesDriven = 0;

        double mpgThistankful = 0.00;

        System.out.println("Enter miles driven, or type -1 to quit: ");
        int milesDriven = input.nextInt();
        System.out.println("Enter gallons: ");
        int gallons = input.nextInt();
        

        while (milesDriven != -1) {
            mpgThistankful = (double) milesDriven / gallons;
            totalmilesDriven = totalmilesDriven + milesDriven;
            totalGallons = totalGallons + gallons;
            
            totalMPG = (double) totalmilesDriven / totalGallons;

            System.out.println("MPG this tankful: " + mpgThistankful);
            System.out.println("Total MPG: " + totalMPG);
            System.out.println("Enter miles driven, or type -1 to quit: ");
            milesDriven = input.nextInt();
            
            if(milesDriven > 0){
            System.out.println("Enter gallons: ");
            gallons = input.nextInt();
            }
        }
    }
}
