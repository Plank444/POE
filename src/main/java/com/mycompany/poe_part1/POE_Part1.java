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
        
        //Object of the UserValidator, PasswordValidator and UserAccount classes
        UsernameValidator usernameValidator = new UsernameValidator();
        PasswordValidator passwordValidator = new PasswordValidator();
        UserAccount userAccount = new UserAccount();
        
         // Prompt for username
        System.out.print("Enter your username: ");
        username = sc.next();
         // Prompt for password
        System.out.print("Enter your password: ");
        password = sc.next();
        
        // Prompt the user for first name and last name
        System.out.print("Enter your first name: ");
        firstName = sc.next();
        
        System.out.print("Enter your last name: ");
        lastName = sc.next();

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
        // successful message after user successfully creates an account
        System.out.println("Account created successfully for " + firstName + " " + lastName + ".");
        
        // enter the users information so that the user is able to login
        String registrationMessage = userAccount.registerUser(username, password, firstName, lastName);
        System.out.println(registrationMessage);

        // Prompt the user to login
        System.out.print("Enter your username to login: ");
        String loginUsername = sc.next();

        System.out.print("Enter your password to login: ");
        String loginPassword = sc.next();

        // Verify the information entered
        if (userAccount.loginUser(loginUsername, loginPassword)) {
            System.out.println("Welcome " + userAccount.getFullName() + ", it is great to see you again.");
        } else {
            System.out.println("Username or password incorrect, please try again.");
        }
    }
}

