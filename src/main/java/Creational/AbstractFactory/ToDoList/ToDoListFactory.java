package Creational.AbstractFactory.ToDoList;

import Creational.AbstractFactory.ToDoList.EmployeeFactory.Employee;
import Creational.Factory.ToDoList.Task;

public interface ToDoListFactory {
    Employee createEmployee();
    Task createTask();
}
