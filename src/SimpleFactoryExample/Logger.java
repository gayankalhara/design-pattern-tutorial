package SimpleFactoryExample;

public abstract class Logger {
    private static Logger instance;

    public abstract void LogError(Throwable ex);

    private static Logger SimpleLoggerFactory(){
        return new PopupLogger();
    }

    static Logger getInstance(){
        if (instance == null) instance = Logger.SimpleLoggerFactory();
        return instance;
    }
}