package Behavioral.Command;

public class ToDoService {
    public static void main(String[] args) {
        Task task1=new Task("Task-1","Test Task 1");

        Command notStartedCommand=new NotStartedCommand(task1);
        Command inProgressCommand=new InProgressCommand(task1);
        Command pendingCommand=new PendingCommand(task1);
        Command cancelledCommand=new CanceledCommand(task1);
        Command completedCommand=new CompletedCommand(task1);
        Command failedCommand=new FailedCommand(task1);

        EmployeeInvoker employee=new EmployeeInvoker(inProgressCommand,notStartedCommand,pendingCommand);
        TeamLeadInvoker teamLead=new TeamLeadInvoker(cancelledCommand,completedCommand,failedCommand);

        employee.startTask();
        employee.finishedTask();
        teamLead.confirmTask();
        task1.undo();
        task1.undo();


    }
}
