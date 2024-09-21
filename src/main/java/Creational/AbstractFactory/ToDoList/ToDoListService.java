package Creational.AbstractFactory.ToDoList;

import Creational.AbstractFactory.ToDoList.EmployeeFactory.Employee;
import Creational.Factory.ToDoList.Task;

public class ToDoListService {
    private ToDoListFactory factory;

    public ToDoListService(ToDoListFactory factory) {
        this.factory = factory;
    }

    public void assignTaskToEmployee() {
        Employee employee = factory.createEmployee();
        Task task = factory.createTask();

        System.out.println(employee.getClass().getSimpleName() + " has been assigned to " + task.getClass().getSimpleName());
        employee.getRole();
        task.execute();
    }
}
