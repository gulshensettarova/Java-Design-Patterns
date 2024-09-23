package Behavioral.Command;

public class InProgressCommand implements Command{
    private final Task task;
    public InProgressCommand(Task task) {
        this.task = task;
    }
    @Override
    public void execute() {
        task.inProgressTask();
    }

    @Override
    public void undo() {
     task.undo();
    }
}
