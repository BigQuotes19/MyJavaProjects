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

public class PrintLeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter start year: ");
        int startYear = input.nextInt();

        if (isLeapYear(startYear) == true) {
            System.out.println("That year is a leap year");
        } else {
            System.out.println("That year is not a leap year");
        }

    }

    public static boolean isLeapYear(int startYear) {
        if (startYear % 4 != 0) {
            return false;
        }

        if (startYear % 100 != 0) {
            return true;
        }

        if (startYear % 400 == 0) {
            return true;
        }
        return false;

    }

}
