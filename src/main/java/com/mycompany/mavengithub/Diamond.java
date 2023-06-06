package com.mycompany.mavengithub;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BossBeast
 */
public class Diamond {

    public static void main(String[] args) {

        int count;
        

        for (int row = 1; row <= 9; row += 2) {  //spaces loop
            count = (9 - row) / 2;
            for (int j = 1; j <= count; j++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("*");

            }

            for (int j = 5; j <= count; j++) {
                System.out.print(" ");

            }
            System.out.println(" ");

        }
//reverse
        for (int row = 7; row > 0; row -= 2) {  //spaces loop
            count = (9 - row) / 2;
            for (int j = 1; j <= count; j++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("*");

            }

            for (int j = 5; j <= count; j++) {
                System.out.print(" ");

            }
            System.out.println(" ");

        }

    }
}
