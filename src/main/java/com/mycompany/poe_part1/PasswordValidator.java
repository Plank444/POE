package com.mycompany.poe_part1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class PasswordValidator {
     public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;

        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[^a-zA-Z0-9].*");

        return hasUppercase && hasNumber && hasSpecialChar;
    }
}
