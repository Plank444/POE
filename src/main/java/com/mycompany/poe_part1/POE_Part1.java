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
        String password;
        String firstName;
        String lastName;
        
        //Create an object for your Scanner
        Scanner sc = new Scanner(System.in);
        
        //Object of the UserValidator and PasswordValidator classes
        UsernameValidator usernameValidator = new UsernameValidator();
        PasswordValidator passwordValidator = new PasswordValidator();
        
         // Prompt for username
        System.out.print("Enter your username: ");
        username = sc.next();
         // Prompt for password
        System.out.print("Enter your password: ");
        password = sc.next();
        
          // Validate username
        if (usernameValidator.checkUserName(username)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return; // Exit if username is invalid
        }
        
         // Validate password
        if (passwordValidator.checkPasswordComplexity(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
            return; // Exit if password is invalid
        }
        
        // Prompt for first name and last name
        System.out.print("Enter your first name: ");
        firstName = sc.next();
        
        System.out.print("Enter your last name: ");
        lastName = sc.next();
        
         // successful message after user successfully creates an account
        System.out.println("Account created successfully for " + firstName + " " + lastName + ".");
    }
}

