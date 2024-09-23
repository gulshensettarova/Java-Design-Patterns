package Behavioral.Command;

public class CanceledCommand implements Command{
    private final Task task;

    public CanceledCommand(Task task) {
        this.task = task;
    }
    @Override
    public void execute() {
        task.cancelTask();
    }

    @Override
    public void undo() {
      task.undo();
    }
}
