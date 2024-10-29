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
        private String taskName;
        private int taskNumber;
        private String taskDescription;
        private String developerFirstName;
        private String developerLastName;
        private int taskDuration;
        private String taskId;
        private String taskStatus;

        public Task(String taskName, int taskNumber, String taskDescription, String developerFirstName,
                    String developerLastName, int taskDuration, String taskId, String taskStatus) {
            this.taskName = taskName;
            this.taskNumber = taskNumber;
            this.taskDescription = taskDescription;
            this.developerFirstName = developerFirstName;
            this.developerLastName = developerLastName;
            this.taskDuration = taskDuration;
            this.taskId = taskId;
            this.taskStatus = taskStatus;
        }
}
