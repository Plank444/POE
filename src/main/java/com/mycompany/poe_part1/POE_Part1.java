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
        Part3 part3 = new Part3();
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
         boolean running = true;

        while (running) {
            //menu
            System.out.println("Task Management System:");
            System.out.println("1. Add a new task");
            System.out.println("2. Display tasks with status 'Done'");
            System.out.println("3. Display the task with the longest duration");
            System.out.println("4. Search for a task by name");
            System.out.println("5. Search for tasks by developer");
            System.out.println("6. Delete a task by name");
            System.out.println("7. Display all tasks");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: 
                    System.out.print("Enter Developer Name: ");
                    String developer = sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String taskName = sc.nextLine();
                    System.out.print("Enter Task ID: ");
                    String taskID = sc.nextLine();
                    System.out.print("Enter Task Duration (in hours): ");
                    int taskDuration = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Status (e.g., Done, In Progress): ");
                    String taskStatus = sc.nextLine();

                    part3.addTask(developer, taskName, taskID, taskDuration, taskStatus);
                    System.out.println("Task added successfully!");
                    break;

                case 2: 
                    part3.displayTasksWithStatusDone();
                    break;

                case 3:
                    part3.displayTaskWithLongestDuration();
                    break;

                case 4:
                    System.out.print("Enter the Task Name to search: ");
                    String searchName = sc.nextLine();
                    part3.searchTaskByName(searchName);
                    break;

                case 5: 
                    System.out.print("Enter the Developer Name to search tasks for: ");
                    String searchDeveloper = sc.nextLine();
                    part3.searchTasksByDeveloper(searchDeveloper);
                    break;

                case 6: 
                    System.out.print("Enter the Task Name to delete: ");
                    String deleteName = sc.nextLine();
                    part3.deleteTask(deleteName);
                    break;

                case 7: 
                    part3.displayAllTasks();
                    break;

                case 8: 
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}

