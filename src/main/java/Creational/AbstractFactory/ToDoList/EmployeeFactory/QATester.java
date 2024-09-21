package Creational.AbstractFactory.ToDoList.EmployeeFactory;

public class QATester implements Employee{

    @Override
    public void getRole() {
        System.out.println("QA Tester");
    }
}
