package Creational.Factory.ToDoList;

public class Maintenance implements Task{
    @Override
    public void execute() {
        System.err.println("Mövcud sistemə texniki xidmət göstərildi");
    }
}
