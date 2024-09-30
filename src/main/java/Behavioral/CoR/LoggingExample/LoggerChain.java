package Behavioral.CoR.LoggingExample;

public class LoggerChain {
    private static  Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        Logger infoLogger = new InfoLogger(Logger.INFO);

        //info->Debug->Error (zencir qurulur)
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        System.out.println("----- Info səviyyəsində mesaj -----");
        loggerChain.logMessage(Logger.INFO, "Bu bir info mesajıdır");

        System.out.println("\n----- Debug səviyyəsində mesaj -----");
        loggerChain.logMessage(Logger.DEBUG, "Bu bir debug mesajıdır");

        System.out.println("\n----- Error səviyyəsində mesaj -----");
        loggerChain.logMessage(Logger.ERROR, "Bu bir error mesajıdır");
    }
}
