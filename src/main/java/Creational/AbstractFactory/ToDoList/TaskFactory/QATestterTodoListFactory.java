package Creational.AbstractFactory.ToDoList.TaskFactory;

import Creational.AbstractFactory.ToDoList.EmployeeFactory.Employee;
import Creational.AbstractFactory.ToDoList.EmployeeFactory.QATester;
import Creational.AbstractFactory.ToDoList.ToDoListFactory;
import Creational.Factory.ToDoList.Task;
import Creational.Factory.ToDoList.Testing;

public class QATestterTodoListFactory implements ToDoListFactory {
    @Override
    public Employee createEmployee() {
        return new QATester();
    }

    @Override
    public Task createTask() {
        return new Testing();
    }
}
