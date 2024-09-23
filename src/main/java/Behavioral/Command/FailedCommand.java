package Behavioral.Command;

public class FailedCommand implements  Command{

    private Task task;
    public FailedCommand(Task task) {
        this.task = task;
    }
    @Override
    public void execute() {
        task.failedTask();
    }

    @Override
    public void undo() {
        task.undo();
    }
}
