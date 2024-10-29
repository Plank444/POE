/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskTest {

    private String taskDescription;
    private int[] taskDuration;
    private int counter;

    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    @Test
    public void testCheckTaskDescription_success_Robyn() {
        String desription = "Create login to authenticate users.";
        boolean result = checkTaskDescription();
        assertTrue(result);
    }

    @Test
    public void testCheckTaskDescription_success_Mike() {
        String desription = "Create login to authenticate users.";
        boolean result = checkTaskDescription();
        assertTrue(result);
    }

    @Test
    public void testCheckTaskDescription_failure_Mike() {

        String desription = "Please enter task description of less than 50 characters";
        boolean result = checkTaskDescription();

        assertFalse(result);

    }

    @Test
    public void testCheckTaskDescription_failure_Robyn() {
        String desription = "Please enter task description of less than 50 characters";
        boolean result = checkTaskDescription();
        assertFalse(result);
    }

    public String createTaskID(String taskName, int taskNumber, String developerdetails) {
        String one = taskName.length() >= 2 ? taskName.substring(0, 2 - 2).toUpperCase() : taskName.toUpperCase();
        String two = taskName.length() >= 2 ? taskName.substring(0, 2 - 2).toUpperCase() : taskName.toUpperCase();
        return one + ":" + taskNumber + ":" + two;
    }

    @Test
    public void testcreateTaskID_Robyn() {
        String Name = "Login Feature";
        int Number = 0;
        String Surname = "Robyn Harrison";
        String expectTaskID = "LO:0:SON";
        String expResult = createTaskID(Name, Number, Surname);
        assertEquals(expectTaskID, expResult);

    }

    @Test
    public void testcreateTaskID_Mike() {
        String Name = "Add Task Feature";
        int Number = 1;
        String Surname = "Mike Smith";
        String expectTaskID = "AD:1:ITH";
        String expResult = createTaskID(Name, Number, Surname);
        assertEquals(expectTaskID, expResult);

    }

    public int returnTotalHours() {
        int totalhours = 0;
        for (int k = 0; k < counter; k++) {
            totalhours += taskDuration[k];
        }
        return totalhours;
    }
    
    @Test
    public void testreturnTotalHours(){
        taskDuration[0] = 10;
        taskDuration[1] = 12;
        taskDuration[2] = 55;
        taskDuration[3] = 11;
        taskDuration[4] = 1;
        
        counter = 5;
        
        int expectedTotalHours = returnTotalHours();
        assertEquals(expectedTotalHours, expectedTotalHours);
    }
}