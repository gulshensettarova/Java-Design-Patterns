package Creational.Singleton;

public class Application {
    public static void main(String[] args) {

        DataBaseConnection db1=DataBaseConnection.getInstance();
        DataBaseConnection db2=DataBaseConnection.getInstance();

        System.out.println(db1==db2);
    }
}
