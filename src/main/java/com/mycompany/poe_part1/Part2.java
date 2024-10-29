/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Part2 {

    public class EasyKanban {
        private boolean isLoggedIn = false; 
        private int taskLimit;             
        private int taskCount = 0;       


    public EasyKanban(int taskLimit) {
        this.taskLimit = taskLimit; 
    }

    public void login() {
        isLoggedIn = true;
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
    }

    public void Menu() {
        if (!isLoggedIn) {
            JOptionPane.showMessageDialog(null, "You must be logged in to peroform that action.");
            return;
        }

        boolean quit = false;
        while (!quit) {           
            String menu = JOptionPane.showInputDialog(null,"====Menu====\n" +
                "1. Add Tasks\n" +
                "2. Show Report (Coming soon)\n" +
                "3. Quit"
            );

            switch (menu) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Add tasks: ");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Coming soon.");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Quit.");
                    quit = true;
                    break;
            }
                    JOptionPane.showInputDialog("Menu", JOptionPane.QUESTION_MESSAGE);
                //Tasks
        switch (menu){
            case "1": JOptionPane.showMessageDialog(null, "Choose to add a task.");
            int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Input the number of tasks: "));
            
            Task[] tasks = new Task[numTasks];
            for (int i = 0; i < numTasks; i++){
                String TaskName = JOptionPane.showInputDialog("Enter task name: " + (i + 1) + ":");
                
                String TaskDescription;
                do{TaskDescription = JOptionPane.showInputDialog("Enter description of task " + (i+1)+":");
                if (TaskDescription.length()>50){
                    JOptionPane.showMessageDialog(null, "Task description shouldn't be more than 50 characters long.");      
                } 
                }while (TaskDescription.length()>50);
                String DeveloperDetails =JOptionPane.showInputDialog("Enter the full name of the developer of the task " + (i+1) + ":");
                double TaskDuration = Double.parseDouble(JOptionPane.showInputDialog("Enter the duration of the task " + (i+1) + "in hours:"));
                
                String TaskStatus = JOptionPane.showInputDialog("Enter the task status " + (i+1) + ":\n1. To do\n2. Doing\n3. Done");
                switch (TaskStatus){
                    case "1": TaskStatus = "To do";
                    break;
                    case "2": TaskStatus = "Doing";
                    break;
                    case "3": TaskStatus = "Done";
                    break;
                }
/*               task[i] = new Task(TaskName, TaskDescription, DeveloperDetails, TaskDuration, TaskStatus);
            }
            StringBuilder TaskDetails = new StringBuilder();
            for (int i = 0; i< tasks.length; i++){
                TaskDetails.append(tasks[i].printTaskDetails()).append("\n");
                
                double TotalHours = Task.returnTotalHours(tasks);
                JOptionPane.showMessageDialog(null, "Total hours: " + TotalHours);
                break;
            }
        }*/
        }
    }
        if (taskCount >= taskLimit) {
            JOptionPane.showMessageDialog(null, "Task limit reached. You cannot add more tasks.");
            return; // Stop if the user has reached the task limit
        }

        String taskDescription = JOptionPane.showInputDialog("Please enter a task description:");
        taskCount++; // Increment task count each time a task is added
        JOptionPane.showMessageDialog(null, "Task '" + taskDescription + "' has been successfully added.\nYou have added " + taskCount + " out of " + taskLimit + " tasks.");
    }
}
}
}
