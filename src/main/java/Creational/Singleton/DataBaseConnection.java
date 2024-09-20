package Creational.Singleton;

public class DataBaseConnection {
    private static DataBaseConnection instance;

    private DataBaseConnection() {}

    public static synchronized DataBaseConnection getInstance() {
        if(instance == null) {
            instance = new DataBaseConnection();
        }
        return instance;
    }
}
