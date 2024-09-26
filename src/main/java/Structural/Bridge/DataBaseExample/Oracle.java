package Structural.Bridge.DataBaseExample;

public class Oracle implements DBConnection{
    @Override
    public void connect() {
        System.err.println("Oracle is connected...");
    }
}
