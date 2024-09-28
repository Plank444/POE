/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POE_Part1 {

    public static void main(String[] args) {
         //Declarations 
        String username;
        
        //Object of the scanner
        Scanner sc = new Scanner(System.in);
        
        //Prompt
        System.out.print("Enter your username: ");
        username = sc.next();
        
        //if statement
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("username successfully captured");
        } else {
            System.out.println("username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
        
        }
    }
    }

