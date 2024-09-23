package Behavioral.Command;

public class Task {
    private String title;
    private String taskDescription;
    private String currentStatus;


    public Task(String title, String taskDescription) {
        this.title = title;
        this.taskDescription = taskDescription;
        this.currentStatus = "Not Started"; // İlk status

    }

    public String getTitle() {
        return title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void notStartedTask(){
        System.out.println("Task not started!");
    }
    public void inProgressTask(){
        currentStatus = "In Progress";
        System.out.println("Task in Progress!");
    }

    public void completeTask() {
        currentStatus = "Completed";
        System.out.println("Task completed!");
    }
    public void cancelTask() {
        currentStatus = "Cancelled";
        System.out.println("Task cancelled!");
    }

    public void pendingTask(){
        currentStatus = "Pending";
        System.out.println("Task pending!");
    }

    public void failedTask(){
        currentStatus = "Failed";
        System.out.println("Task failed!");
    }

    public void undo(){
        switch(currentStatus){
            case "Not Started": notStartedTask();break;
            case "In Progress": notStartedTask();break;
            case "Completed","Cancelled","Failed": pendingTask();break;
            case "Pending": inProgressTask();break;
        }
    }
}
