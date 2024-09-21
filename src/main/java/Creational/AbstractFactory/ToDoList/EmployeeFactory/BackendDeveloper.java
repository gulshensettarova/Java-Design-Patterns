package Creational.AbstractFactory.ToDoList.EmployeeFactory;

public class BackendDeveloper implements Employee{
    @Override
    public void getRole() {
        System.out.println("Backend Developer");
    }
}
