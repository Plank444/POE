/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    

     public static boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;

        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[^a-zA-Z0-9].*");

        return hasUppercase && hasNumber && hasSpecialChar;
    }
  
     public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    } 
     
    public String registerUser(String username, String password, String firstName, String lastName) {
       

        // Check username
        if (!checkUserName(username)) {
            return "Please ensure that your username is correctly formatted, it should contain an underscore and is no more than 5 characters in length.";
        }

        // Check password
        if (!checkPasswordComplexity(password)) {
            return "Please ensure that your password is correctly formatted, password should contain at least 8 characters, a capital letter, a number, and a special character.";
        }

        // Checks if both conditions pass, if they do then the user is registered
        this.username = username;
        this.password = password; 
        this.firstName = firstName;
        this.lastName = lastName;

        return "User registered successfully.";
    }
    
 // Ensures the login details matches the ones stored when a user registers
    public boolean loginUser(String username, String password) {
        return this.username != null && this.username.equals(username) && this.password.equals(password);
    }
    
       public String returnLoginStatus(boolean login){
   if (login){
       return "Welcome " + firstName + " , " + lastName + " it is great to see you again.";
   }else{ 
       return "Username password incorrect, please try again.";
   }
   }     
     

   

   


    
   

}
//
    
