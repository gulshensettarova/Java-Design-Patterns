package Behavioral.CoR.LoggingExample;

public class ErrorLogger extends Logger{
    public ErrorLogger(int level){
        this.level=level;
    }
    @Override
    public void writeLogMessage(String message) {
        System.out.println("Error Logger: " + message);

    }
}
