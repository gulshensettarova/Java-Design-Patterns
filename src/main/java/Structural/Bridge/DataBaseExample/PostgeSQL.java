package Structural.Bridge.DataBaseExample;

public class PostgeSQL implements DBConnection{
    @Override
    public void connect() {
        System.err.println("PostgreSQL is connected...");
    }
}
