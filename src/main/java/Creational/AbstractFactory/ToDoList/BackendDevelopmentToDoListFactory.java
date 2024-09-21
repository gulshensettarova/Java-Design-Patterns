package Creational.AbstractFactory.ToDoList;

import Creational.AbstractFactory.ToDoList.EmployeeFactory.BackendDeveloper;
import Creational.AbstractFactory.ToDoList.EmployeeFactory.Employee;
import Creational.Factory.ToDoList.FeatureDevelopment;
import Creational.Factory.ToDoList.Task;

public class BackendDevelopmentToDoListFactory implements ToDoListFactory {
    @Override
    public Employee createEmployee() {
        return new BackendDeveloper();
    }

    @Override
    public Task createTask() {
        return new FeatureDevelopment(); // Backend Developer üçün uyğun task
    }
}
