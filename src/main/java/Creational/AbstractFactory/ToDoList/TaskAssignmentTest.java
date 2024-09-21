package Creational.AbstractFactory.ToDoList;

public class TaskAssignmentTest {
    public static void main(String[] args) {
        // Backend Developer üçün factory istifadə olunur
        ToDoListService backendService = new ToDoListService(new BackendDevelopmentToDoListFactory());
        backendService.assignTaskToEmployee();

        // DevOps üçün factory istifadə olunur
        ToDoListService devopsService = new ToDoListService(new DevOpsToDoListFactory());
        devopsService.assignTaskToEmployee();
    }
}
