package Creational.AbstractFactory.ToDoList.TaskFactory;

public class FeatureDevelopment implements Task {
    @Override
    public void execute() {
        System.err.println("Yeni funksionallıq əlavə edildi");
    }
}
