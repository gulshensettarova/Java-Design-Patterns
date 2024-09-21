package Creational.AbstractFactory.ToDoList.EmployeeFactory;

public class Devops implements Employee{
    @Override
    public void getRole() {
        System.out.println("Devops");
    }
}
