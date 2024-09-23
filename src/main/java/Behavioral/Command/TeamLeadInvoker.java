package Behavioral.Command;

public class TeamLeadInvoker {
    private Command canceled;
    private Command completed;
    private Command failed;

    public TeamLeadInvoker(Command canceled, Command completed, Command failed) {
        this.canceled = canceled;
        this.completed = completed;
        this.failed = failed;
    }
    public void confirmTask(){
        completed.execute();
    }
    public void rejectTask(){
        failed.execute();
    }
    public void deleteTask(){
        canceled.execute();
    }
}
