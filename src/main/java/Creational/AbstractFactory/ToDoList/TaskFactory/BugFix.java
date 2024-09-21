package Creational.AbstractFactory.ToDoList.TaskFactory;

public class BugFix implements Task {
    @Override
    public void execute() {
        System.err.println("Mövcud olan problemlər həll edildi.");
    }
}
