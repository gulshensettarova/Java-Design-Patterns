package Creational.Factory.ToDoList;

public class BugFix implements Task{
    @Override
    public void execute() {
        System.err.println("Mövcud olan problemlər həll edildi.");
    }
}
