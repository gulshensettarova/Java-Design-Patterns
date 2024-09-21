package Creational.AbstractFactory.ToDoList.TaskFactory;

public class Maintenance implements Task {
    @Override
    public void execute() {
        System.err.println("Mövcud sistemə texniki xidmət göstərildi");
    }
}
