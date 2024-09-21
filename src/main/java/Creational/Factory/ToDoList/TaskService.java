package Creational.Factory.ToDoList;

public class TaskService {
    public static void main(String[] args) {
        TaskFactory type1= TaskFactory.FEATURE_DEVELOPMENT;
        Task task1=type1.createTask();
        task1.execute();

        //Ve ya :
        Task task2= TaskFactory.BUG_FIX.createTask();
        task2.execute();

        //Ve ya :
        TaskFactory.REFACTORING.createTask().execute();

        //Qeyd : Gorunduyu kimi taskin yaradilma prossesini hem abstractlasdirdiq
        // hem de daha sade ve daha qisa bir kod elde etdik
    }
}
