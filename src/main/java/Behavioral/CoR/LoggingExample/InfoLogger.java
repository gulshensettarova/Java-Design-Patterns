package Behavioral.CoR.LoggingExample;

public class InfoLogger extends Logger{
    public InfoLogger(int level){
        this.level=level;
    }
    @Override
    public void writeLogMessage(String message) {
        System.err.println("INFO Logger: " + message);
    }
}
