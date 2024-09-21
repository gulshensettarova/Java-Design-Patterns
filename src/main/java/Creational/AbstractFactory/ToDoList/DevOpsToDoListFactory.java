package Creational.AbstractFactory.ToDoList;

import Creational.AbstractFactory.ToDoList.EmployeeFactory.Devops;
import Creational.AbstractFactory.ToDoList.EmployeeFactory.Employee;
import Creational.Factory.ToDoList.Maintenance;
import Creational.Factory.ToDoList.Task;

public class DevOpsToDoListFactory implements ToDoListFactory {
    @Override
    public Employee createEmployee() {
        return new Devops();
    }

    @Override
    public Task createTask() {
        return new Maintenance(); // DevOps üçün uyğun task
    }
}