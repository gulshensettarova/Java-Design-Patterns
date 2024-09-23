package Behavioral.Command;

public class CompletedCommand  implements  Command{

    private final Task task;

    public CompletedCommand(Task task) {
        this.task = task;
    }
    @Override
    public void execute() {
        task.completeTask();
    }

    @Override
    public void undo() {
      task.undo();
    }
}
