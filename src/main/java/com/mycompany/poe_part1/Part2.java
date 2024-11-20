/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Part2 {
    //Declarations
    private boolean isloggedIn;
    private int maxTasks;
    private int currentTaskCount = 0;
    private ArrayList<Task> tasks = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    

    
    
    //Method to add tasks. Allows user to input information.
    public void addTasks() {
        
        String taskLimitInput = JOptionPane.showInputDialog("Input number of tasks you would like to add?");
        maxTasks = Integer.parseInt(taskLimitInput);

        while (currentTaskCount < maxTasks) {
            String taskName = JOptionPane.showInputDialog("Enter Task Name:");
            String taskDescription = JOptionPane.showInputDialog("Enter Task Description (Do not enter more than 50 caracters.):");

            //Formatting the length of the Task Description
            if (taskDescription.length() > 50) {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                continue; 
            }

            String developerFirstName = JOptionPane.showInputDialog("Enter Developer's First Name:");
            String developerLastName = JOptionPane.showInputDialog("Enter Developer's Last Name:");
            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours):"));

            //Generate the TaskID
            String taskId = generateTaskID(taskName, currentTaskCount, developerLastName);

            String[] options = {"To Do", "Doing", "Done"};
            String taskStatus = (String) JOptionPane.showInputDialog(null, "Select Task Status:", "Task Status", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            JOptionPane.showMessageDialog(null, "Task successfully added.");
            Task task = new Task(taskName, currentTaskCount, taskDescription, developerFirstName, developerLastName, taskDuration, taskId, taskStatus);
            JOptionPane.showMessageDialog(null, task.printTaskDetails());
            
            // Add task to the list
            tasks.add(new Task(taskName, currentTaskCount, taskDescription, developerFirstName, developerLastName, taskDuration, taskId, taskStatus));
            currentTaskCount++;
        }

        JOptionPane.showMessageDialog(null, "Task entry limit reached.");
    }

    private String generateTaskID(String taskName, int taskNumber, String developerLastName) {
        String taskInitials = taskName.length() >= 2 ? taskName.substring(0, 2).toUpperCase() : taskName.toUpperCase();
        String devLastPart = developerLastName.length() >= 3 ? developerLastName.substring(developerLastName.length() - 3).toUpperCase() : developerLastName.toUpperCase();
        return taskInitials + ":" + taskNumber + ":" + devLastPart;
    }

    // Option for showing a report (currently not implemented)
    public void showReport() {
        JOptionPane.showMessageDialog(null, "Coming soon");
    }

    // Quit the application
    public void quit() {
        JOptionPane.showMessageDialog(null, "Goodbye!");
        System.exit(0);
    }

    
    }
//

