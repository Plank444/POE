
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author RC_Student_lab
 */
/*
public class Part3 {
    
    // Declaration
    private List<String> developers = new ArrayList<>();
    private List<String> taskNames = new ArrayList<>();
    private List<String> taskIds = new ArrayList<>();
    private List<Integer> taskDurations = new ArrayList<>();
    private List<String> taskStatuses = new ArrayList<>();

    // Method to add a task
    public void addTask(String developer, String taskName, String taskId, int duration, String status) {
        developers.add(developer);
        taskNames.add(taskName);
        taskIds.add(taskId);
        taskDurations.add(duration);
        taskStatuses.add(status);
    }

    // Method to get developers list
    public List<String> getDevelopers() {
        return developers;
    }

    // Method to get task names list
    public List<String> getNames() {
        return taskNames;
    }

    // Method to display tasks with the status "Done"
    public String displayTasksWithStatusDone() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < taskStatuses.size(); i++) {
            if (taskStatuses.get(i).equalsIgnoreCase("Done")) {
                result.append("Developer: ").append(developers.get(i))
                      .append(", Task Name: ").append(taskNames.get(i))
                      .append(", Duration: ").append(taskDurations.get(i)).append(" hours\n");
            }
        }
        return result.toString();
    }

    // Method to find the task with the longest duration
    public String displayTaskWithLongestDuration() {
        if (taskDurations.isEmpty()) {
            return "No tasks available.";
        }
        int maxIndex = 0;
        for (int i = 1; i < taskDurations.size(); i++) {
            if (taskDurations.get(i) > taskDurations.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return developers.get(maxIndex) + ", " + taskDurations.get(maxIndex);
    }

    // Method to search for a task by name
    public String searchTaskByName(String taskName) {
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskNames.get(i).equalsIgnoreCase(taskName)) {
                return developers.get(i) + ", " + taskNames.get(i);
            }
        }
        return "Task not found.";
    }

    // Method to search all tasks assigned to a specific developer
    public String searchTasksByDeveloper(String developer) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < developers.size(); i++) {
            if (developers.get(i).equalsIgnoreCase(developer)) {
                result.append(taskNames.get(i)).append("\n");
            }
        }
        return result.length() > 0 ? result.toString().trim() : "No tasks found for the developer.";
    }

    // Method to delete a task by name
    public boolean deleteTask(String taskName) {
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskNames.get(i).equalsIgnoreCase(taskName)) {
                developers.remove(i);
                taskNames.remove(i);
                taskIds.remove(i);
                taskDurations.remove(i);
                taskStatuses.remove(i);
                return true; // Task successfully deleted
            }
        }
        return false; // Task not found
    }

    // Method to display all tasks
    public String displayAllTasks() {
        StringBuilder report = new StringBuilder();
        for (int i = 0; i < taskNames.size(); i++) {
            report.append("Developer: ").append(developers.get(i))
                  .append(", Task Name: ").append(taskNames.get(i))
                  .append(", Task ID: ").append(taskIds.get(i))
                  .append(", Duration: ").append(taskDurations.get(i)).append(" hours")
                  .append(", Status: ").append(taskStatuses.get(i)).append("\n");
        }
        return report.toString();
    }
}
*/
