package Behavioral.CoR.LoggingExample;

public class DebugLogger extends Logger {

    public DebugLogger(int level){
        this.level=level;
    }
    @Override
    public void writeLogMessage(String message) {
        System.out.println("Debug Logger: " + message);

    }
}

