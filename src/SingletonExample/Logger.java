package SingletonExample;

public class Logger {
    private static Logger instance;

    public void LogError(Throwable ex){
        ex.printStackTrace();
    }

    public static Logger getInstance(){
        if (instance == null) instance = new Logger();
        return instance;
    }
}