package Behavioral.Command;

public class PendingCommand implements Command{
    private final Task task;
    public PendingCommand(Task task) {
        this.task = task;
    }
    @Override
    public void execute() {
        task.pendingTask();
    }

    @Override
    public void undo() {
     task.undo();
    }
}
