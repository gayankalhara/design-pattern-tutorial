package AdaptorExample;

public abstract class Logger {
    private static Logger instance;

    public abstract void logError(Throwable ex);

    private static Logger SimpleLoggerFactory(){
        return new SendErrorInfo();
    }

    static Logger getInstance(){
        if (instance == null) instance = Logger.SimpleLoggerFactory();
        return instance;
    }
}