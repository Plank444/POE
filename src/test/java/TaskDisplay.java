/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.poe_part1.Part3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;

/**
 *
 * @author RC_Student_lab
 */
public class TaskDisplay {
    @Test
    public void testAddAndRetrieveTasks() {
        Part3 part3 = new Part3();
        
        // Add test data
        part3.addTask("Mike Smith", "Create Login", "T001", 5, "To Do");
        part3.addTask("Edward Harrison", "Create Add Features", "T002", 8, "Doing");
        part3.addTask("Samantha Paulson", "Create Reports", "T003", 2, "Done");
        part3.addTask("Glenda Oberholzer", "Add Arrays", "T004", 11, "To Do");

        // Test getDevelopers
        assertEquals(List.of("Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"), part3.getDevelopers());
        
        // Test displayTaskWithLongestDuration
        assertEquals("Glenda Oberholzer, 11", part3.displayTaskWithLongestDuration());
        
        // Test searchTaskByName
        assertEquals("Mike Smith, Create Login", part3.searchTaskByName("Create Login"));
        
        // Test searchTasksByDeveloper
        assertEquals("Create Reports", part3.searchTasksByDeveloper("Samantha Paulson"));
        
        // Test deleteTask
        assertTrue(part3.deleteTask("Create Reports"));
        
        
    String expectedReport = """
        Developer: Mike Smith, Task Name: Create Login, Task ID: T001, Duration: 5 hours, Status: To Do
        Developer: Edward Harrison, Task Name: Create Add Features, Task ID: T002, Duration: 8 hours, Status: Doing
        Developer: Glenda Oberholzer, Task Name: Add Arrays, Task ID: T004, Duration: 11 hours, Status: To Do
        """;
        assertEquals(expectedReport, part3.displayAllTasks());
    }
}