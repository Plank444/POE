/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part1;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JDialog;

/**
 *
 * @author RC_Student_lab
 */
public class POE_Part1 {

    public static void main(String[] args) {
      final JDialog j = new JDialog();
      j.setAlwaysOnTop(true);
        //Declarations
        String username;
        String password;
        String firstName;
        String lastName;
        
        //Create an object for your Scanner
        Scanner sc = new Scanner(System.in);
        
        //Object of the UserValidator, PasswordValidator and UserAccount classes
        //UsernameValidator usernameValidator = new UsernameValidator();
        Login login = new Login();
        //UserAccount userAccount = new UserAccount();
        //EasyKanban easyKanban = new EasyKanban(taskLimit);
        
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
        if (login.checkUserName(username)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return; // Exit if username is invalid
        }
        
         // Validate password
        if (login.checkPasswordComplexity(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
            return; // Exit if password is invalid
        }    
        // successful message after user successfully creates an account
        System.out.println("Account created successfully for " + firstName + " " + lastName + ".");
        
        // enter the users information so that the user is able to login
        String registrationMessage = login.registerUser(username, password, firstName, lastName);
        System.out.println(registrationMessage);

        // Prompt the user to login
        System.out.print("Enter your username to login: ");
        String loginUsername = sc.next();

        System.out.print("Enter your password to login: ");
        String loginPassword = sc.next();
        
        // Verify the information entered
        boolean loginSuccessfull = login.loginUser(loginUsername, loginPassword);
        String loginStatus = login.returnLoginStatus(loginSuccessfull);
        System.out.println(loginStatus);
        //EasyKanban.menu();
        
         if(loginSuccessfull){
             
             JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
              Part2 part = new Part2();
             while (true) {
            String[] options = {"Add task", "\nShow Report (Coming soon)", "\nQuit"};
            int option = JOptionPane.showOptionDialog(null, "Select an option", "Main Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (option) {
                case 0 -> part.addTasks();
                case 1 -> part.showReport();
                case 2 -> part.quit();
            }
        
    }
        

}
    }
}

