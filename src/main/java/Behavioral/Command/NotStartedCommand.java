package Behavioral.Command;

public class NotStartedCommand implements Command{
    private final Task task;
    public NotStartedCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.notStartedTask();
    }

    @Override
    public void undo() {
     task.undo();
    }
}
