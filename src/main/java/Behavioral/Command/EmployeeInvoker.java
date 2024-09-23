package Behavioral.Command;

public class EmployeeInvoker {
   private Command inProggress;
   private Command notStarted;
   private Command pending;

    public EmployeeInvoker(Command inProggress, Command notStarted, Command pending) {
        this.inProggress = inProggress;
        this.notStarted = notStarted;
        this.pending = pending;
    }
    public void startTask() {
        inProggress.execute();
    }
    public void notStartedTask() {
        notStarted.execute();
    }
    public void finishedTask() {
        pending.execute();
    }
}
