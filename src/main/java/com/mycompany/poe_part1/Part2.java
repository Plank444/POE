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
    private boolean isloggedIn;
    private int maxTasks;
    private int currentTaskCount = 0;
    private ArrayList<Task> tasks = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Part2(boolean loggedIn, int maxTasks) {
        this.isloggedIn = loggedIn;
        this.maxTasks = maxTasks;
    }

    public void EasyKanban() {
        if (isloggedIn) {
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        } else {
            JOptionPane.showMessageDialog(null, "Please enusre that you're first logged in.");
        }
    }

    public void addTasks() {
        if (!isloggedIn) {
            JOptionPane.showMessageDialog(null, "Please log in to add tasks.");
            return;
        }

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

            // Add task to the list
            tasks.add(new Task(taskName, currentTaskCount, taskDescription, developerFirstName, developerLastName, taskDuration, taskId, taskStatus));
            currentTaskCount++;

            JOptionPane.showMessageDialog(null, "Task successfully added.");
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

    public void Menu() {
        while (true) {
            String[] options = {"====Menu====", "Show Report (Coming soon)", "Quit"};
            int option = JOptionPane.showOptionDialog(null, "Select an option", "Main Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (option) {
                case 0 -> addTasks();
                case 1 -> showReport();
                case 2 -> quit();
            }
        }
    }
}/*      
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
        
        }
    }
        if (taskCount >= taskLimit) {
            JOptionPane.showMessageDialog(null, "You have reached task limit.");
            return;
        }

        String taskDescription = JOptionPane.showInputDialog("Please enter a task description:");
        taskCount++;
        JOptionPane.showMessageDialog(null, "Task '" + taskDescription + "' has been successfully added.\nYou have added " + taskCount + " out of " + taskLimit + " tasks.");
    }
}
}
*/

