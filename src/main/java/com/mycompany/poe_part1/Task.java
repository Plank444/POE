/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    //
    String TaskName;
    String TaskNumber;
    String TaskDescription;
    String DeveloperDetails;
    double TaskDuration;
    String TaskID;
    String TaskStatus;
    
    public Task(String TaskName, String TaskNumber, String TaskDescription, String DeveloperDetails, double TaskDuration, String TaskID, String TaskStatus){
    this.TaskName = TaskName;
    this.TaskNumber = TaskNumber;
    this.TaskDescription = TaskDescription;
    this.DeveloperDetails = DeveloperDetails;
    this.TaskDuration = TaskDuration;
    this.TaskID = TaskID;
    this.TaskStatus = TaskStatus;
    }
    
    public boolean checkTaskDescription(){
        return TaskDescription.length() <=50;
    }

    public String createTaskID(){
        String taskNameDisplay = TaskName.length() >=2  ? TaskName.substring(0, 2).toUpperCase() : TaskName.toUpperCase();
        String developerDetailsDisplay = DeveloperDetails.length() >= 3 ? DeveloperDetails.substring(DeveloperDetails.length() - 3).toUpperCase() : DeveloperDetails.toUpperCase();
        return taskNameDisplay + ":" + developerDetailsDisplay;
    }
}
