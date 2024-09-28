
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
/*
public class UserRegistrationSystem {
    private String registeredUsername;
    private String registeredPassword;

    // Method to check if the username contains an underscore and is no more than 5 characters long
    public boolean checkUserName(String username) {
        if(username.length() <= 5 && username.contains("_")) {
            return true;
        }
        return false;
    }

    // Method to check if the password meets complexity rules
    public boolean checkPasswordComplexity(String password) {
        if(password.length() >= 8 &&
            containsUpperCaseLetter(password) &&
            containsDigit(password) &&
            containsSpecialCharacter(password)) {
            return true;
        }
        return false;
    }

    //uppercase letter method
    private boolean containsUpperCaseLetter(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    //method to check if string contains a digit
    private boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    //special characters method
    private boolean containsSpecialCharacter(String str) {
        Pattern specialCharPattern = Pattern.compile("[!@#$%^&*(),.?\":{}|<>]");
        Matcher matcher = specialCharPattern.matcher(str);
        return matcher.find();
    }

    // Method to register a user
    public String registerUser(String username, String password) {
        if (!checkUserName(username)) {
            return "Username is incorrectly formatted.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password does not meet the complexity requirements.";
        }

        // If username and password are valid, store them and register the user
        registeredUsername = username;
        registeredPassword = password;
        return "User registered successfully.";
    }

    // Method to verify the entered details
    public boolean loginUser(String username, String password) {
        return username.equals(registeredUsername) && password.equals(registeredPassword);
    }

    // Method to return login status message
    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return "Login successful!";
        }
        return "Login failed. Please check your username or password.";
    }
}*/